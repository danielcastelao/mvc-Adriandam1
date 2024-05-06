
import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelTests {

    @Test
    public void pruebaCrearCoche() {
        Coche coche = Model.crearCoche(0,"456A","Audi");
        Assertions.assertEquals(0,coche.velocidad);
        Assertions.assertEquals("456A",coche.matricula);
        Assertions.assertEquals("Audi",coche.modelo);
    }
    @Test
    public void pruebaGetCoche(){
        Coche coche = Model.crearCoche(0,"Ferrari","5454F");
        Assertions.assertSame(coche,Model.getCoche("5454F"));
    }
    @Test
    public void pruebaCambiarVelocidad(){
        Coche coche = Model.crearCoche(0,"6767C","Citroen");
        Assertions.assertEquals(24,Model.cambiarVelocidad("6767C",24));
    }
    @Test
    public void pruebagetVelocidad(){
        Coche coche = Model.crearCoche(0,"Seat","123asd");
        Assertions.assertEquals(45,Model.getVelocidad("123asd"));
    }
}