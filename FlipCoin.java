package com.basicprogram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number: ");
        int count = sc.nextInt();
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < count; i++) {
            double random = Math.random();
            if (random < 0.5)
                tailsCount++;
            else
                headsCount++;
        }

        System.out.println("percentageof tails(" + tailsCount + "):" + (tailsCount * 100f / (headsCount + tailsCount)));
        System.out.println("percentage of heads(" + headsCount + "):" + (headsCount * 100f / (headsCount + tailsCount)));
    }

}