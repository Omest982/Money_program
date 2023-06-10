package com.Omest982.Money_program.service.Imp;

import com.Omest982.Money_program.model.Wallet;
import com.Omest982.Money_program.repository.WalletRepository;
import com.Omest982.Money_program.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImp implements WalletService {

    private final WalletRepository walletRepository;

    @Autowired
    public WalletServiceImp(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Wallet saveWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    @Override
    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    @Override
    public Wallet getById(long id) {
        return walletRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAll() {
        walletRepository.deleteAll();
    }

    @Override
    public List<Wallet> getByUserId(long user_id) {
        return walletRepository.findByUserId(user_id);
    }
}
