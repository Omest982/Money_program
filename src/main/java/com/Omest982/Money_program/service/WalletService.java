package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.Wallet;

import java.util.List;

public interface WalletService {
    public Wallet saveWallet(Wallet wallet);
    public List<Wallet> getAllWallets();
    public Wallet getById(long id);
    public void deleteAll();
    public List<Wallet> getByUserId(long user_id);
}
