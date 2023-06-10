package com.Omest982.Money_program.security.jwt;

import com.Omest982.Money_program.model.Role;
import com.Omest982.Money_program.model.Status;
import com.Omest982.Money_program.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {
    public JwtUserFactory() {
    }
    public static JwtUser createJwtUser(User user){
        return new JwtUser(user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getUpdated(),
                user.getStatus().equals(Status.ACTIVE),
                mapToGrantedAuthority(new ArrayList<>(user.getRoles()))
                );
    }

    public static List<GrantedAuthority> mapToGrantedAuthority(List<Role> userRoles){
        return userRoles.stream().map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
