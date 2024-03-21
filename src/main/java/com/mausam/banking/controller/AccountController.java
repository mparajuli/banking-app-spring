package com.mausam.banking.controller;

import com.mausam.banking.dto.AccountDto;
import com.mausam.banking.mapper.AccountMapper;
import com.mausam.banking.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController // Make this class as a Spring MVC RestController class
@RequestMapping("/api/accounts") // Base url for all REST APIs in this class
public class AccountController {
    private AccountService accountService;

    // Note: We are not using @Autowired for Constructor dependency bc this class (AccountController) has only one
    // constructor and Spring will automatically inject the dependencies.
    public AccountController(AccountService accountService) { // Constructor-based Dependency Injection
        this.accountService = accountService;
    }

    // Add Account REST API
    @PostMapping // Make this method a REST API
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) { // @RequestBody: map request body to java object - converts JSON to accountDto object
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    // Get Account REST API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) { // @PathVariable - Map values from the URI template to the method parameters
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    // Deposit REST API
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id, // @PathVariable - bind {id} with id argument
                                              @RequestBody Map<String, Double> request) { // @RequestBody - map Request JSON body to Java map object "request"
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.deposit(id, amount);
        return ResponseEntity.ok(accountDto);
    }

    // Withdraw REST API
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
                                               @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.withdraw(id, amount);
        return ResponseEntity.ok(accountDto);
    }

    // Get All Accounts REST API
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    // Delete Account REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account deleted successfully!");
    }

}
