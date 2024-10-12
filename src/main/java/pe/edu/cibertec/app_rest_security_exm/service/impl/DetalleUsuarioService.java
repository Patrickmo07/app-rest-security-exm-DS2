package pe.edu.cibertec.app_rest_security_exm.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_rest_security_exm.model.Rol;
import pe.edu.cibertec.app_rest_security_exm.model.Usuario;
import pe.edu.cibertec.app_rest_security_exm.service.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service

public class DetalleUsuarioService implements UserDetailsService {

    private final IUsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.obtenerUsuarioXNombre(username);

        return crearUserDetail(usuario,obtenerRolesUsuario(usuario.getRoles()));
    }

    //arreglar arreglo con auth
    public List<GrantedAuthority> obtenerRolesUsuario(Set<Rol> rolesList){
        List<GrantedAuthority> rolesAuth= new ArrayList<>();
        for (Rol rol: rolesList){
            rolesAuth.add(new SimpleGrantedAuthority("ROLE_"+rol.getNomrol()));
        }
        return rolesAuth;
    }

    private UserDetails crearUserDetail(
            Usuario usuario, List<GrantedAuthority> authorityList
    ){
        return new User(
                usuario.getNomusuario(),
                usuario.getPassword(),
                usuario.getActivo(),
                true,
                true,
                true,
                authorityList);
    }
}
