package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

/**
 * Otro observador que se suscribe a los cambios de velocidad de un coche
 */
public class ObserverLimite implements Observer {
    // velocidad máxima
    final static int LIMITE = 120;
    /**
     * Este es el observador de limite de velocidad
     * @param coche Coche al que se le actualizó la velocidad
     */

    public void update(Coche coche, Model model) {
        // verificamos veloidad máxima
        if (coche.velocidad > LIMITE) {
            //Indicamos estamos bajando velocidad
            System.out.println("[ObserverLimite] Reduciendo velocidad: ");
            //Llamada al modelo
            model.cambiarVelocidad(coche.matricula, coche.velocidad-10);
        }
    }
}
