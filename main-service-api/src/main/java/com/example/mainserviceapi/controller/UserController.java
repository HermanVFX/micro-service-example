package com.example.mainserviceapi.controller;

import com.example.mainservice.controller.UserApi;
import com.example.mainservice.dto.Filter;
import com.example.mainservice.dto.UserDto;
import com.example.mainservice.dto.UserDtoPage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {
    @Override
    public ResponseEntity<UserDto> createAndUpdateUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<UserDtoPage> getAllUserByCriteria(Pageable pageable, Filter filter) {
        return null;
    }
}
