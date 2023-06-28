package com.Omest982.Money_program.service.Imp;

import com.Omest982.Money_program.model.Transaction;
import com.Omest982.Money_program.repository.TransactionRepository;
import com.Omest982.Money_program.service.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImp implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImp(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
