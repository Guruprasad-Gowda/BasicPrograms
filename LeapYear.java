package com.basicprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = sc.nextInt();

        if (year < 9999) {
            if (((year % 400 == 0) && (year % 100 != 0)) || year % 4 == 0) {
                System.out.println("its a leap year");
            } else {
                System.out.println("its not a leap year");
            }
        } else {
            System.out.println("give a valid 4 digits");
        }

    }
}