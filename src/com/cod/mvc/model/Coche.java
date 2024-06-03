package com.cod.mvc.model;

/** Clase Coche que nos representa al coche de la aplicacion
 *
 */


public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;
    /**
     * Constructor de la clase
     * @param matricula del coche
     * @param modelo del coche
     */
    public Coche(String modelo, String matricula, Integer velocidad) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    /**
     * getter y setter de los atributos del coche
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }


    /**
     * Método toString
     * @return el coche en formato String
     */
    @Override
    public String toString() {
        return "Coche: " +
                "\nmatricula: " + matricula  +
                "\nmodelo: " + modelo +
                "\nvelocidad: " + velocidad;
    }
}
