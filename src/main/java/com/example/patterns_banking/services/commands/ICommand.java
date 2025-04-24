package com.example.patterns_banking.services.commands;

public interface ICommand<T> {
  T execute();
}
