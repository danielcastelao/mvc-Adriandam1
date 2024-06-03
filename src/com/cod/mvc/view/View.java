package com.cod.mvc.view;

public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v del coche
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println("[View] " + matricula + ": " + v + "km/hr");
        return true;
    }
}
