package com.Omest982.Money_program.repository;


import com.Omest982.Money_program.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    public List<Wallet> findByUserId(long user_id);
}
