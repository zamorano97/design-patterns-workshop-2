package com.example.patterns_banking.factory;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.models.Customer;

public interface AccountFactory {
  Account createAccount(Customer customer, String accountNumber, Double balance);
}
