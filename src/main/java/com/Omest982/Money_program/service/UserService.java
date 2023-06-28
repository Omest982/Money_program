package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getUserByUsernameAndPassword(String username, String password);
    public void deleteAll();
}
