package pe.edu.cibertec.app_rest_security_exm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nomusuario;
    private String email;
    private String  password;
    private Boolean activo;

    //conexion de tablas - relacion
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)

    @JoinTable(name = "usuario_rol",
    joinColumns = @JoinColumn(name = "idusuario"),
    inverseJoinColumns = @JoinColumn(name = "idrol"))
    private Set<Rol>roles;

}
