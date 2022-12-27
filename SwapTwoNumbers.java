package com.basicprogram;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int i = sc.nextInt();
        System.out.println("Enter The Second Number");
        int j = sc.nextInt();
        System.out.println("Enter The Third Number");
        int k = sc.nextInt();

//        int i = 10;
//        int j = 20;
//        int k = 30;
        System.out.println("---Before Swap---");
        System.out.println("i= " + i + " and j= " + j + " annd k= " + k);
        int temp = i;
        i = j;
        j = k;
        k = temp;
        System.out.println("---After Swap---");
        System.out.println("i= " + i + " and j= " + j + " and k= " + k);
    }

}
