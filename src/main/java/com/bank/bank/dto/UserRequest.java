package com.bank.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class UserRequest {
    private String firstname;
    private String secondname;
    private String gender;
    private String address;
    private String PhoneNumber;
    private String status;
    private String email;
}
