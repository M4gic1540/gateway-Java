# ShopSmart - API Gateway

Gateway para enrutar solicitudes a los microservicios de ShopSmart.

## Requisitos
- Java 17
- Maven 3.9+

## Ejecutar
```bash
mvn spring-boot:run
```

## Rutas iniciales
- `/usuarios/**` -> `http://localhost:8081/**` (se aplica `StripPrefix=1`)

Ejemplo:
```
POST http://localhost:8080/usuarios/api/v1/auth/login
```
