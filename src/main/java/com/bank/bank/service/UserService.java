package com.bank.bank.service;

import com.bank.bank.dto.BankResponse;
import com.bank.bank.dto.UserRequest;

public interface UserService {

    BankResponse creatAccount(UserRequest userRequest);
}