package com.example.mainserviceapi.controller;

import com.example.mainservice.controller.AccountApi;
import com.example.mainservice.dto.AccountDto;
import com.example.mainservice.dto.AccountDtoPage;
import com.example.mainservice.dto.Filter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController implements AccountApi {
    @Override
    public ResponseEntity<AccountDto> createAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public ResponseEntity<AccountDtoPage> getAllAccountByCriteria(Pageable pageable, Filter filter) {
        return null;
    }

    @Override
    public ResponseEntity<AccountDto> updatePasswordForAccount(AccountDto accountDto) {
        return null;
    }
}
