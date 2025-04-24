package com.example.patterns_banking.factory;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.models.Customer;
import com.example.patterns_banking.models.SavingsAccount;
import org.springframework.stereotype.Component;

@Component
public class SavingsAccountFactory  implements AccountFactory {
  @Override
  public Account createAccount(Customer customer, String accountNumber, Double balance) {
    SavingsAccount account = new SavingsAccount();
    account.setAccountNumber(accountNumber);
    account.setBalance(balance);
    account.setCustomer(customer);
    return account;
  }
}
