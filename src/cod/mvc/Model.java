package cod.mvc;

import java.util.ArrayList;

public class Model {

    public static ArrayList<Coche> parking = new ArrayList<>();

    public Coche crearCoche(int velocidad, String matricula, String modelo){
        Coche nuevoCoche = new Coche(velocidad, matricula, modelo);
        parking.add(nuevoCoche);
        return nuevoCoche;
    }
    public Coche getCoche (String matricula){
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    public void cambiarVelocidad (String Coche, int velocidad){

    }

    public void getVelocidad (String velocidad){

    }




}
