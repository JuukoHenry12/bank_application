package com.bank.bank.service;

import com.bank.bank.dto.BankResponse;
import com.bank.bank.dto.UserRequest;
import com.bank.bank.entity.User;
import com.bank.bank.util.AccountUtils;
import java.math.BigDecimal;
public class UserServiceImpl implements UserService {
    @Override
    public BankResponse creatAccount(UserRequest userRequest) {
    
        User newUser = User.builder()
                       .firstname(userRequest.getFirstname())
                       .secondname(userRequest.getSecondname())
                       .gender(userRequest.getGender())
                       .address(userRequest.getAddress())
                       .PhoneNumber(userRequest.getPhoneNumber())
                       .AccountBalance(BigDecimal.ZERO)
                       .status("Active")
                       .email(userRequest.getEmail())
                       .accountNUmber(AccountUtils.generateAccountNumber())
                       .build();
    }

    
} 