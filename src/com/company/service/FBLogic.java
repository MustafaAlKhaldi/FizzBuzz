package com.company.service;

import java.util.ArrayList;

public class FBLogic {
    public String counterLogic(int currentNumber) {
        String quote = "";

        if (currentNumber % 5 == 0 && currentNumber % 3 == 0) {
            return quote = "FizzBuzz";
        } else if (currentNumber % 3 == 0) {
            return quote = "fizz";
        } else if (currentNumber % 5 == 0) {
            return quote = "Buzz";
        } else {
            return quote = "none";
        }
    }

    public ArrayList fillList (ArrayList newList, int count) {
        for (int i = 1; i <= count; i++) {
            newList.add(i);
        }
        return newList;
    }
}
