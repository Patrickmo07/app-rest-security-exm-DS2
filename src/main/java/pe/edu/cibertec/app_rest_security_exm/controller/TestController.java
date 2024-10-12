package pe.edu.cibertec.app_rest_security_exm.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exm/test")
public class TestController {

    @PreAuthorize("hasRole('GESTOR')")
    @PostMapping
    public ResponseEntity<String> testtxtGestor() {
        return new ResponseEntity<>("Hola Gestor", HttpStatus.OK);
    }

    @PreAuthorize("hasRole('COORDINADOR')")
    @GetMapping
    public ResponseEntity<String> testtxtCoordinador() {
        return new ResponseEntity<>("Hola Coordinador", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> testtxtGestorYCoordinador() {
        return new ResponseEntity<>("Hola Usuario", HttpStatus.OK);
    }
}
