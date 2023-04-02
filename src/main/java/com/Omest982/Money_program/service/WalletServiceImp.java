package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.Wallet;
import com.Omest982.Money_program.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WalletServiceImp implements WalletService{

    @Autowired
    WalletRepository walletRepository;

    @Override
    public Wallet saveWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    @Override
    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    @Override
    public Optional<Wallet> getById(long id) {
        return walletRepository.findById(id);
    }

    @Override
    public void deleteAll() {
        walletRepository.deleteAll();
    }
}
