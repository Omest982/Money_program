package com.Omest982.Money_program.repository;

import com.Omest982.Money_program.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmailAndPassword(String email, String password);

    public User findByUsername(String username);

}
