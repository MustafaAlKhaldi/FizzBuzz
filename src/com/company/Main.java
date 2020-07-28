package com.company;

import com.company.model.FBCounter;
import com.company.service.FBLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FBLogic fbl = new FBLogic();
        System.out.println("How many numbers do you want to count to?");
        int count = scanner.nextInt();

        FBCounter counter = new FBCounter(count);

        ArrayList newNumList = counter.getOriginal();
        ArrayList filledNumList = fbl.fillList(newNumList, count);

        for (int i = 0; i < filledNumList.size(); i++) {
            String quote = "";
            String numS = filledNumList.get(i).toString();
            int numI = Integer.parseInt(numS);
            quote = fbl.counterLogic(numI);

            if (quote.equals("none")) {
                System.out.println(numI);
            } else {
                System.out.println(quote);
            }
        }

    }
}
