package com.example.patterns_banking.services;

import com.example.patterns_banking.dtos.AccountDTO;
import com.example.patterns_banking.factory.AccountFactoryProvider;
import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.repositories.IAccountRepository;
import com.example.patterns_banking.repositories.ICustomerRepository;
import com.example.patterns_banking.services.commands.CreateAccountCommand;
import com.example.patterns_banking.services.commands.DepositCommand;
import com.example.patterns_banking.services.commands.GetAllAccountsCommand;
import com.example.patterns_banking.services.commands.ICommand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
  private final IAccountRepository accountRepository;
  private final ICustomerRepository customerRepository;
  private final AccountFactoryProvider accountFactoryProvider;

  public AccountService(IAccountRepository accountRepository, ICustomerRepository customerRepository, AccountFactoryProvider accountFactoryProvider) {
    this.accountRepository = accountRepository;
    this.customerRepository = customerRepository;
    this.accountFactoryProvider = accountFactoryProvider;
  }

  public Account createAccount(AccountDTO accountDTO) {
    ICommand<Account> command = new CreateAccountCommand(accountRepository, customerRepository, accountFactoryProvider, accountDTO);
    return command.execute();
  }

  public Account deposit(Long accountId, Double amount) {
    ICommand<Account> command = new DepositCommand(accountRepository, accountId, amount);
    return command.execute();
  }
  public List<Account> findAllAccounts() {
    ICommand<List<Account>> command = new GetAllAccountsCommand(accountRepository);
    return command.execute();
  }
}
