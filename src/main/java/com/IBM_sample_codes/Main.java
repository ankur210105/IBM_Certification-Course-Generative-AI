package com.IBM_sample_codes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to my practice questions");
        System.out.println("Kindly enter your choice");
        System.out.println("Press 1. for basic chatbot");
        System.out.println("Press 2. for linear regression");
        System.out.println("Press 3. to exit");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                Basic_Chatbot.chatbot();
                break;
            case 2:
                Liner_Regression.run_regression();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Wrong Choice Entered");
        }
    }
}
