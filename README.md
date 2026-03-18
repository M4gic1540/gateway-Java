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
- `/api/v1/auth/**` -> `http://localhost:8081`
- `/api/v1/usuarios/**` -> `http://localhost:8081`
- `/api/v1/admin/usuarios/**` -> `http://localhost:8081`

Ejemplo:
```
POST http://localhost:8080/api/v1/auth/login
```
