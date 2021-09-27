package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    String again = ("y");
        double VAT = (1.2);
        while (again.contains("y")){
            System.out.println("enter your starting amount:");
            double enterAmount = input.nextDouble();
            double finalAmount = enterAmount*VAT;
            double roundOff = Math.round(finalAmount*100)/100D;
            System.out.println("your price + VAT is £"+roundOff);
            System.out.println("do you want to do another price? y/n");
            again = input.next();
        }
    }
}
