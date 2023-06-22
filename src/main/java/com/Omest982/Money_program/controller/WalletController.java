package com.Omest982.Money_program.controller;

import com.Omest982.Money_program.model.Wallet;
import com.Omest982.Money_program.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet")
@CrossOrigin
public class WalletController {
    @Autowired
    WalletService walletService;

    @PostMapping("/add")
    public String add(@RequestBody Wallet wallet){
        walletService.saveWallet(wallet);
        return "New wallet is added";
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        walletService.deleteAll();
    }

    @PostMapping("/updateMoney")
    public String updateMoney(@RequestBody Wallet wallet, @RequestParam int money){
        wallet.setMoney(money);
        walletService.saveWallet(wallet);
        return "Wallet successfully updated!";
    }

    @GetMapping("/getAll")
    public List<Wallet> getAll(){return walletService.getAllWallets();}

    @GetMapping("/{id}")
    public Wallet getById(@PathVariable long id){
        return walletService.getById(id);
    }

    @GetMapping("/get")
    public List<Wallet> getByUserId(@RequestParam long user_id){
        return walletService.getByUserId(user_id);
    }
}
