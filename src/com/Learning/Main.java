package com.Learning;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final byte monthOfYear = 12;
        final byte percentage = 100;
        int Principle;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principle ($1k - $1M):");
            Principle = scanner.nextInt();
            if (Principle < 1000 || Principle > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,00");
                continue;
            }
            break;
        }
        float monthlyRate;
        while (true) {
            System.out.print("Annual Interest Rate:");
            float annualInterest = scanner.nextFloat();
            if (annualInterest <= 0 || annualInterest > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                continue;
            }
            monthlyRate = (annualInterest) / (monthOfYear * percentage);
            break;
        }
        int numberOfPayment;
        while (true) {
            System.out.print("Period (Years):");
            byte period = scanner.nextByte();
            if (period <= 0 || period > 30) {
                System.out.println("Enter a value between 1 and 30");
                continue;
            }
            numberOfPayment = period * monthOfYear;
            break;

        }
        double mortgage = (Principle*monthlyRate*Math.pow((1+monthlyRate),numberOfPayment))/(Math.pow((1+monthlyRate),numberOfPayment)-1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //System.out.println(mortgage);
        System.out.println("Mortgage:"+currency.format(mortgage));
    }
}



