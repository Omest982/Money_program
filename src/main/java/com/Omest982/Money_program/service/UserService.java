package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.model.Wallet;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void saveUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getUser(String username, String password);
    public void updateUser(User user);
    public void deleteAll();
}
