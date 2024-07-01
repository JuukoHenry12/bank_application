package com.bank.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo {
   private String AccountName;
   private String AccountNumber;
   private String AccountBalance;
}
