import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ModelTests {
    private Controller controller;
    private Model model;

    @BeforeEach
    public void setup() {
        model = new Model();
    }

    @Test
    public void crearCocheReturnTrue() {
        Assertions.assertNotNull(model.crearCoche("modelo", "matricula", 0));
    }

    @Test
    public void cambiarVelocidadComprobarCambioReturnTrue() {
        Coche coche = model.crearCoche("modelo", "matricula", 0);
        Integer velocidad = 40;
        model.cambiarVelocidad("matricula", velocidad);
        Assertions.assertEquals(velocidad, coche.getVelocidad());
    }

    @Test
    public void comprobarAddCocheIntoParkingReturnTrue() {
        Coche coche = model.crearCoche("modelo", "matricula", 0);
        Assertions.assertEquals(model.getCoche(coche.getMatricula()), coche);
    }

    @Test
    public void testGetDatosCoche() {
        Coche coche = model.crearCoche("modelo", "matricula", 0);
        Assertions.assertEquals(coche, model.getCoche("matricula"));
        Assertions.assertNull(model.getCoche("mimatricula"));
    }

    @Test
    public void testCambiarVelocidadYObtenerVelocidad() {
        String matricula = "ALpine";
        String modelo = "Ocon";
        Integer velocidadInicial = 0;
        Coche coche = model.crearCoche(modelo, matricula, velocidadInicial);

        Integer velocidad = model.getVelocidad(matricula);
        Assertions.assertEquals(velocidadInicial, velocidad);

        Integer nuevaVelocidad = 40;
        model.cambiarVelocidad(matricula, nuevaVelocidad);

        velocidad = model.getVelocidad(matricula);
        Assertions.assertEquals(nuevaVelocidad, velocidad);
    }

    @Test
    public void testSubirVelocidad() {
        String matricula = "cochesubevelocidad";
        String modelo = "Alonso";
        Integer velocidadInicial = 150;
        Coche coche = model.crearCoche(modelo, matricula, velocidadInicial);

        Integer velocidad = model.getVelocidad(matricula);
        Assertions.assertEquals(velocidadInicial, velocidad);

        Integer incremento = 10;
        model.subirVelocidad(matricula, incremento);

        int nuevaVelocidad = model.getVelocidad(matricula);
        Assertions.assertEquals(velocidadInicial + incremento, nuevaVelocidad);
    }

    @Test
    public void testBajarVelocidad() {
        String matricula = "Cochequebajavelocidad";
        String modelo = "Ferrari";
        Integer velocidadInicial = 150;
        Coche coche = model.crearCoche(modelo, matricula, velocidadInicial);

        Integer velocidad = model.getVelocidad(matricula);
        Assertions.assertEquals(velocidadInicial, velocidad);

        Integer decremento = 10;
        model.bajarVelocidad(matricula, decremento);

        int nuevaVelocidad = model.getVelocidad(matricula);
        Assertions.assertEquals(velocidadInicial - decremento, nuevaVelocidad);
    }

}