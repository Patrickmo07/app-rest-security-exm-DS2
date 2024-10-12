package pe.edu.cibertec.app_rest_security_exm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.app_rest_security_exm.model.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
}
