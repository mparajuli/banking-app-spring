package com.mausam.banking.mapper;

import com.mausam.banking.dto.AccountDto;
import com.mausam.banking.entity.Account;

public class AccountMapper {
    // Convert AccountDto into Account jpa entity.
    // jpa entity : java class mapped to database tables.
    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    // Convert Account jpa entity into AccountDto.
    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
