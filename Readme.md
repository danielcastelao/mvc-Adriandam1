# Tarea: arquitectura MVC

Tarea para implementar arquitectura MVC

Utiliza objetos coches, modifica la velocidad y la muestra

---

## Clases ```com.cod.mvc.controller.Controller``` y ```com.cod.mvc.model.Model```

- Implementa la clase ```com.cod.mvc.controller.Controller``` y ```com.cod.mvc.model.Model``` según el diagrama de clases.

- Implementa los métodos ```crearCoche()```, ```getCoche()```, ```cambiarVelocidad()``` y ```getVelocidad()```

- Realiza los test necesarios para comprobar que funcionan correctamente

### Diagrama de clases:


https://app.diagrams.net/?mode=google#G1gCHq9nHmzmpR8z-u5TRBpMl04kcNJfXh#%7B%22pageId%22%3A%22C5RBs43oDa-KdzZeNtuy%22%7D


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