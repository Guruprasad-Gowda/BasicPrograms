package com.basicprogram;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Provide a number to find out its factor: ");
        Scanner sc = new Scanner(System.in);
        int factorNumber = sc.nextInt();

        for (int i = 2; i <= factorNumber; i++) {
            while (factorNumber % i == 0)
                factorNumber = factorNumber / i;
            System.out.print(i + " ");
        }

    }
}
