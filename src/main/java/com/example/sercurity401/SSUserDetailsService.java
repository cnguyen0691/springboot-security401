package com.example.sercurity401;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class SSUserDetailsService implements UserDetailsService{
    private UserRepository userRepository;
    public SSUserDetailsService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getApple());
    authorities.add()
}
