package com.bank.bank.util;

import java.time.Year;

public class AccountUtils {

    public static String generateAccountNumber() {
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        int randoNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randoNumber);
        StringBuilder accountNUmber = new StringBuilder();

        return accountNUmber.append(randomNumber).append(year).toString();
    }

}