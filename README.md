
# Parcial 2, parte 1.

Microservicios Eureka y Estudiante. 

```bash
  http://localhost:8761

```
## Ejercicios de teoria:

### 1. Debe investigar y colocar en este documento el significado de cada uno de  los decoradores que se encuentra en esta clase (Entidad Alumno).

| Decorador             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| @Entity |  Este decorador , indica que la clase representa una tabla en una base de datos relacional. Cada instancia de esta clase representa una fila en esa tabla. |
| @Table | Este decorador se utiliza en combinación con @Entity para especificar el nombre de la tabla en la base de datos que está asociada con la entidad.|
| @ToString | Este decorador, también parte de Lombok, genera automáticamente un método toString() para la clase que incluye la representación de cadena de todos los campos de la clase. |
| @NoArgsConstructor | Este decorador, nuevamente de Lombok, genera automáticamente un constructor sin argumentos para la clase. Este constructor vacío puede ser útil en situaciones donde necesitas crear instancias de la clase sin proporcionar argumentos. |

### 2. Investigar y colocar dentro de este documento el concepto del decorador Transaction.

| Decorador             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| @Transactional |  Este decorador, se utiliza para definir el alcance de la transacción que rodea a un método. Puede configurarse para diferentes propósitos, como solo lectura o lectura/escritura. Esto asegura la consistencia de la base de datos y ayuda a prevenir problemas de concurrencia y pérdida de datos.|
| @Transactional(readOnly = true) |  Este decorador indica que el método está configurado para operaciones de solo lectura en la base de datos. |

### 3. Definir que significa los siguientes conceptos en Spring Boot :

| Concepto             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| ResponseEntity<?> | Es una clase que representa la respuesta HTTP completa en Spring, incluyendo código de estado, cabeceras y cuerpo. Se usa en controladores para devolver respuestas personalizadas. |
| Optional | Es una clase de Java que envuelve un valor que puede ser presente o ausente, ayudando a evitar excepciones de puntero nulo. |
| @PathVariable | Es una anotación de Spring MVC que se utiliza en métodos de controlador para vincular variables de ruta de la URL a parámetros de método, también puede extraer valores de la URL de una solicitud HTTP y utilizarlos en el método del controlador.  |


### 4. Investigar y colocar en este parte del documento lo que es el servidor EUREKA como parte de Spring Cloud

| Concepto             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| EUREKA | El servidor Eureka es un componente de Spring Cloud que proporciona un servicio de registro y descubrimiento para microservicios en un entorno distribuido, lo cual permite que los microservicios se encuentren unos a otros dinámicamente. |


