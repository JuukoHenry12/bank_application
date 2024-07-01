package com.bank.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BankResponse {
    private String ResponseCode;
    private String Responseessage;
    private AccountInfo AccountInfo;
}
