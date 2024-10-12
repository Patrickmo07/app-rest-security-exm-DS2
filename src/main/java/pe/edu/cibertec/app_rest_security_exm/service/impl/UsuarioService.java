package pe.edu.cibertec.app_rest_security_exm.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_rest_security_exm.model.Usuario;
import pe.edu.cibertec.app_rest_security_exm.repository.UsuarioRepository;
import pe.edu.cibertec.app_rest_security_exm.service.IUsuarioService;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUsuarioXNombre(String nomUsuario) {
        return usuarioRepository.findByNomusuario(nomUsuario);
    }

}
