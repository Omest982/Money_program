package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.Wallet;

import java.util.List;
import java.util.Optional;

public interface WalletService {
    public Wallet saveWallet(Wallet wallet);
    public List<Wallet> getAllWallets();
    public Optional<Wallet> getById(long id);
    public void deleteAll();
}
