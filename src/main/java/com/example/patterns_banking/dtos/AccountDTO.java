package com.example.patterns_banking.dtos;

import com.example.patterns_banking.factory.AccountFactoryProvider.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
  private String accountNumber;
  private Double balance;
  private Long customerId;
  private AccountType accountType;
}
