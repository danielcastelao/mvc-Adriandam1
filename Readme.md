# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC

Utiliza objetos coches, modifica la velocidad y la muestra

---

## Clases ```com.cod.mvc.controller.Controller``` y ```com.cod.mvc.model.Model```

- Implementa la clase ```com.cod.mvc.controller.Controller``` y ```com.cod.mvc.model.Model``` según el diagrama de clases.

- Implementa los métodos ```crearCoche()```, ```getCoche()```, ```cambiarVelocidad()``` y ```getVelocidad()```

- Realiza los test necesarios para comprobar que funcionan correctamente

### Diagrama de clases:

```mermaid
classDiagram
    class com.cod.mvc.model.Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class com.cod.mvc.controller.Controller{
          +main()
      }
      class com.cod.mvc.view.View {+muestraVelocidad(String, Integer)}
      class com.cod.mvc.model.Model {
          ArrayList~com.cod.mvc.model.Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
      }
    com.cod.mvc.controller.Controller "1" *-- "1" com.cod.mvc.model.Model : association
    com.cod.mvc.controller.Controller "1" *-- "1" com.cod.mvc.view.View : association
    com.cod.mvc.model.Model "1" *-- "1..n" com.cod.mvc.model.Coche : association
      
```

---

### Diagrama de Secuencia

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant com.cod.mvc.model.Model
    participant com.cod.mvc.controller.Controller
    participant com.cod.mvc.view.View
    com.cod.mvc.controller.Controller->>com.cod.mvc.model.Model: Puedes crear un coche?
    activate com.cod.mvc.model.Model
    com.cod.mvc.model.Model-->>com.cod.mvc.controller.Controller: Creado!
    deactivate com.cod.mvc.model.Model
    com.cod.mvc.controller.Controller->>+com.cod.mvc.view.View: Muestra la velocidad, porfa
    activate com.cod.mvc.view.View
    com.cod.mvc.view.View->>-com.cod.mvc.view.View: Mostrando velocidad
    com.cod.mvc.view.View-->>com.cod.mvc.controller.Controller: Listo!
    deactivate com.cod.mvc.view.View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant com.cod.mvc.model.Model
    participant com.cod.mvc.controller.Controller
    participant com.cod.mvc.view.View
    com.cod.mvc.controller.Controller->>com.cod.mvc.model.Model: crearCoche("Mercedes", "BXK 1234")
    activate com.cod.mvc.model.Model
    com.cod.mvc.model.Model-->>com.cod.mvc.controller.Controller: com.cod.mvc.model.Coche
    deactivate com.cod.mvc.model.Model
    com.cod.mvc.controller.Controller->>+com.cod.mvc.view.View: muestraVelocidad("BXK 1234", velocidad)
    activate com.cod.mvc.view.View
    com.cod.mvc.view.View->>-com.cod.mvc.view.View: System.out.println()
    com.cod.mvc.view.View-->>com.cod.mvc.controller.Controller: boolean
    deactivate com.cod.mvc.view.View
```