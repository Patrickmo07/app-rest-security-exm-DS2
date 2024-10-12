package pe.edu.cibertec.app_rest_security_exm.service;

import pe.edu.cibertec.app_rest_security_exm.model.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioXNombre(String nomUsuario);
}
