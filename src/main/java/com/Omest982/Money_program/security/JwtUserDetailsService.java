package com.Omest982.Money_program.security;

import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.security.jwt.JwtUserFactory;
import com.Omest982.Money_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JwtUserDetailsService implements UserDetailsService {

    private final UserService userService;
    @Autowired
    public JwtUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("Username not found!");
        }

        return JwtUserFactory.createJwtUser(user);
    }
}
