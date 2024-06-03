package com.cod.mvc.model;

import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

/**
 * El Model será el encargado de notificar a los observadores.
 */
public class Model implements Observable {
    // Array de coches
    static ArrayList<Coche> parking = new ArrayList<>();

    // Lista de observadores
    private static final ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a los observadores.
     * Se ejecutará el método update() de cada observador.
     * @param coche el coche cuyo estado ha cambiado
     */
    @Override
    public void notifyObservers(Coche coche, Model model) {
        for (Observer observer : observers) {
            observer.update(coche, model);
        }
    }

    /**
     * Crea un coche y lo añade al parking.
     * @param modelo del coche
     * @param matricula identificador único
     * @param velocidad velocidad inicial del coche
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula, Integer velocidad){
        Coche aux = new Coche(modelo, matricula, velocidad);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca un coche según su matrícula.
     * @param matricula a buscar
     * @return el coche encontrado o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // Recorre el array buscando por matrícula
        for (Coche e: parking) {
            if (e.getMatricula().equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche, notificando a los observadores.
     * @param matricula identificador del coche
     * @param v nueva velocidad
     * Los metodos en controller subir y bajar velocidad parten de aqui
     */
    public void cambiarVelocidad(String matricula, Integer v) {
        // Busca el coche
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(v);

            // Notifica a todos los observadores
            notifyObservers(coche, this);
        }
    }

    /**
     * Sube la velocidad de un coche en una cantidad específica.
     * @param matricula identificador del coche
     * @param aumento la cantidad a aumentar en la velocidad
     */
    public void subirVelocidad(String matricula, Integer aumento) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() + aumento);
            //notificamos a los observers
            notifyObservers(coche, this);
        }
    }

    /**
     * Baja la velocidad de un coche en una cantidad específica.
     * @param matricula identificador del coche
     * @param disminucion la cantidad a disminuir en la velocidad
     */
    public void bajarVelocidad(String matricula, Integer disminucion) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(coche.getVelocidad() - disminucion);
            //notificamos a los observers
            notifyObservers(coche, this);
        }
    }

    /**
     * Devuelve la velocidad según la matrícula del coche.
     * @param matricula identificador del coche
     * @return velocidad del coche actual
     */
    public Integer getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche != null ? coche.getVelocidad() : null;
    }
}
