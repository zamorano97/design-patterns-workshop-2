package com.example.patterns_banking.factory;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AccountFactoryProvider {
  private final CheckingAccountFactory checkingAccountFactory;
  private final SavingsAccountFactory savingsAccountFactory;

  public AccountFactoryProvider(CheckingAccountFactory checkingAccountFactory, SavingsAccountFactory savingsAccountFactory) {
    this.checkingAccountFactory = checkingAccountFactory;
    this.savingsAccountFactory = savingsAccountFactory;
  }

  public AccountFactory getFactory(AccountType type) {
    Map<AccountType, AccountFactory> factories = Map.of(
      AccountType.CHECKING, checkingAccountFactory,
      AccountType.SAVINGS, savingsAccountFactory);

    return  factories.get(type);
  }

  public enum AccountType {
    CHECKING,
    SAVINGS
  }
}
