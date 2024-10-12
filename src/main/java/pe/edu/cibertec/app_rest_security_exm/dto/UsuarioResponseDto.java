package pe.edu.cibertec.app_rest_security_exm.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioResponseDto {
    private Integer idusuario;
    private String email;
    private String token;
}
