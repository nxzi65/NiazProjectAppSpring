package com.mkniazi.walletapp.repository;

import com.mkniazi.walletapp.entity.Transaction;
import com.mkniazi.walletapp.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findByWallet(Wallet wallet);
}
