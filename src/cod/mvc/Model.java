package cod.mvc;

import java.util.ArrayList;

public class Model {

    public static ArrayList<Coche> parking = new ArrayList<>();


    /**
     * Crea coche con los parametros
     * @param matricula
     * @param modelo
     * @param velocidad
     * @return coche creado
     */
    public static Coche crearCoche(int velocidad, String matricula, String modelo){
        Coche nuevoCoche = new Coche(velocidad, matricula, modelo);
        parking.add(nuevoCoche);
        return nuevoCoche;
    }
    /**
     * Busca el coche por su matricula y lo devuelva si lo encuentra
     * @param matricula identificador unico
     * @return coche encontrado o null si no existe
     */
    public static Coche getCoche(String matricula){
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }
    /**
     * Cambia la velocidad del coche segun su matricula
     * @param matricula identificador unico
     * @param velocidad variable a cambiar
     * @return nueva velocidad
     */
    public static int cambiarVelocidad(String matricula, int velocidad){
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidad;
        return velocidad;
    }
    /**
     * Devuelve la velocidad del coche indicado
     * @param matricula identificador unico
     * @return velocidad del coche indicado
     */
    public static int getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }




}
