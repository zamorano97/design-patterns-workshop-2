package com.example.patterns_banking.factory;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.models.Customer;
import com.example.patterns_banking.models.LowAmountAccount;
import org.springframework.stereotype.Component;

@Component
public class LowAmountAccountFactory implements AccountFactory {

    @Override
    public Account createAccount(Customer customer, String accountNumber, Double balance) {
        LowAmountAccount account = new LowAmountAccount();
        account.setAccountNumber(accountNumber);
        account.setBalance(balance);
        account.setCustomer(customer);
        return account;
    }

}