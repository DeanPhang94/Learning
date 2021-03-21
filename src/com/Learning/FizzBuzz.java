package com.Learning;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int Input = scanner.nextInt();
        if (Input%5==0 && Input%3==0)
            System.out.println("FizzBuzz");
        else if (Input%5==0)
            System.out.println("Fizz");
        else if (Input%3==0)
            System.out.println("Buzz");
        else
            System.out.println(Input);
    }
}
