package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

/**
 * El controlador que maneja la lógica de negocio y la comunicación entre la vista y el modelo.
 */
public class Controller{

    // Definimos la instancia del modelo
    private final Model miModel;

    /**
     * Constructor que inicializa el controlador y crea los observadores necesarios.
     * @param miModel el modelo a ser controlado
     */
    public Controller(Model miModel){
        this.miModel = miModel;

        // Instanciamos al observador de la velocidad
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModel.addObserver(observoVelocidad);

        // Instanciamos un segundo observador para el límite de velocidad
        ObserverLimite observoLimite = new ObserverLimite();
        miModel.addObserver(observoLimite);
    }

    /**
     * Crea un coche y lo agrega al modelo.
     * @param nombre el nombre del coche
     * @param matricula la matrícula del coche
     * @param velocidad la velocidad inicial del coche
     */
    public void crearCoche(String nombre, String matricula, Integer velocidad){
        miModel.crearCoche(nombre, matricula, velocidad);
    }

    /**
     * Sube la velocidad de un coche en una cantidad específica.
     * @param matricula la matrícula del coche
     * @param v la cantidad a aumentar en la velocidad
     */

    public void subirVelocidad(String matricula, Integer v){
        miModel.subirVelocidad(matricula, v);
    }

    /**
     * Baja la velocidad de un coche en una cantidad específica.
     * @param matricula la matrícula del coche
     * @param v la cantidad a disminuir en la velocidad
     */

    public void bajarVelocidad(String matricula, Integer v) {
        miModel.bajarVelocidad(matricula, v);
    }
}
