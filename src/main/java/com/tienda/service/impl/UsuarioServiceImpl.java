
package com.tienda.service.impl;

import com.tienda.dao.UsuarioDao;
import com.tienda.domain.Rol;
import com.tienda.domain.Usuario;
import com.tienda.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tawnny Elizondo
 */
@Service("userDetailsService")
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService{

   @Autowired
   private UsuarioDao usuarioDao;
   
    @Autowired
   private HttpSession session;
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        //Busca el usuario en la base de datos
        Usuario usuario=usuarioDao.findByUsername(username);
        //Si el usuario no existe lanza la excepcion
        if(usuario==null){
            throw new UsernameNotFoundException(username);
        }
        session.removeAttribute("usuarioImagen");
        session.setAttribute("usuarioImagen", usuario.getRutaImagen());
        
        var roles=new ArrayList<GrantedAuthority>();
        
        for (Rol rol:usuario.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        //se retorna un objeto de tipo "User" con los datos
        return new User(usuario.getUsername(), usuario.getPassword(),roles);
    }
}
