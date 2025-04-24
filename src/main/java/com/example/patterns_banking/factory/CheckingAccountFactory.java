package com.example.patterns_banking.factory;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.models.CheckingAccount;
import com.example.patterns_banking.models.Customer;
import org.springframework.stereotype.Component;

@Component
public class CheckingAccountFactory implements AccountFactory {
  @Override
  public Account createAccount(Customer customer, String accountNumber, Double balance) {
    CheckingAccount account = new CheckingAccount();
    account.setAccountNumber(accountNumber);
    account.setBalance(balance);
    account.setCustomer(customer);
    return account;
  }
}
