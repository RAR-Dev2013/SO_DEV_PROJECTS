package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double amount, dollar, peso;

        System.out.println("Testing");

        //Scanner object created
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the SoDev Currency Converter! \n Enter the amount you wish to convert and see instant results");


        System.out.println("Which currency do you wish to convert");
        System.out.println("1.Dollar\n2.)Peso");
        double code = sc.nextInt();

        System.out.println("How much money do you want to convert ");
        amount = sc.nextFloat();

        if (code == 1) {
            dollar = amount;
            System.out.println("Your conversion is: " + amount + "Dollars");
        } else {
            peso = amount / 0.050;
            System.out.println(peso);
        }



    }
}
