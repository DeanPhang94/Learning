package com.Learning;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle:");
        int Principle = scanner.nextInt();
        System.out.print("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        final byte monthOfYear = 12;
        final byte percentage = 100;
        float monthlyRate = (annualInterest)/(monthOfYear*percentage);
        System.out.print("Period (Years):");
        byte period = scanner.nextByte();
        int numberOfPayment = period*monthOfYear;
        double mortgage = (Principle*monthlyRate*Math.pow((1+monthlyRate),numberOfPayment))/(Math.pow((1+monthlyRate),numberOfPayment)-1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(mortgage);
        System.out.println("Mortgage:"+currency.format(mortgage));
    }
}
