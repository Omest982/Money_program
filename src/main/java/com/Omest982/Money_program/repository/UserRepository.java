package com.Omest982.Money_program.repository;

import com.Omest982.Money_program.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmailAndPassword(String email, String password);

    public Optional<User> findByUsername(String username);

}
