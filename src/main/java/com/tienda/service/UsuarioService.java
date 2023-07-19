
package com.tienda.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Tawnny Elizondo
 */
public interface UsuarioService {
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
