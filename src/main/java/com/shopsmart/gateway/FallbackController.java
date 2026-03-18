package com.shopsmart.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Endpoint de contingencia del gateway cuando un microservicio no responde.
 */
@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/usuarios")
    public ResponseEntity<Map<String, String>> fallbackUsuarios() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(Map.of(
            "codigo", "SERVICIO_NO_DISPONIBLE",
            "mensaje", "El servicio de usuarios no esta disponible temporalmente.",
            "servicio", "usuarios-service"
        ));
    }
}
