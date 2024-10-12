package pe.edu.cibertec.app_rest_security_exm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.app_rest_security_exm.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
//Anotacion
    Usuario findByNomusuario(String nomusuario);
}
