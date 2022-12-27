package com.basicprogram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber : ");
        int N = sc.nextInt();
        int power = 1;

        for (int i = 0; i < N; i++) {
            power *= 2;
        }

        System.out.println("2^" + N + " is " + power);
    }

}
