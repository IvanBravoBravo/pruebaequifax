prueba tecnica equifax

backend:

- microservicio con spring boot
- base de datos postgresql
- java jdk 8
- maven 3.8.1
- utilizacion de anotaciones
- contraseña encriptada
- test con junit 4 y mockito
- ddl en : src/main/resources/data.sql
- input del servicio:
      lat=-12.123&lng=-21.321
- salida del servicio:
-   {
    "resultados": {
        "lan_input": "-12.123",
        "lng_input": "-21.321",
        "datos": {
            "campo1": "info1row1",
            "campo2": "info2row1"
        }
    }
}

frontend: Pendiente

compilar:
- mvn clean package (usar mvnw, si no tiene instalado maven)

test:
- mvn test

correr aplicacion
- mvn spring-boot:run


