package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.model.Wallet;
import com.Omest982.Money_program.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public void updateUser(User user) {
        Optional<User> optionalUser = getUser(user.getUsername(), user.getPassword());
        if (optionalUser.isPresent()){
            User tempUser = userRepository.getReferenceById(optionalUser.get().getId());
        }

    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
