package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

/**
 * Clase principal
 */
public class App {

    public static void main(String[] args) {
        // Inicializamos la app
        // instanciamos el modelo
        Model miModel = new Model();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("LaFerrari", "SBC 1234",100);
        miController.crearCoche("Alpine", "HYU 4567",200);
        miController.crearCoche("Aston Martin", "FGH 3333",100);
        miController.crearCoche("Mercedes", "masbajo",120);

        // Cambiar la velocidad de un coche
        miController.subirVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        // sobrepasando la velocidad máxima
        miController.bajarVelocidad("HYU 4567", 10);

        //subida de vvelocidad a astonmartin confirma metodos funcionan
        miController.subirVelocidad("FGH 3333", 20);

        //Bajada de velocidad mercesdes confirma baja velocidad
        miController.bajarVelocidad("masbajo", 10);

    }
}
