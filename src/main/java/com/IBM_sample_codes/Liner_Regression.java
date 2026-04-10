package com.IBM_sample_codes;

import java.util.Scanner;

public class Liner_Regression {
    public static void run_regression() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of months");
        int mo=sc.nextInt();
        int [] months=new int[mo];
        int [] sales=new int[mo];
        for(int i=0;i<mo;i++)
        {
            System.out.println("Enter month number");
            months[i]=sc.nextInt();
            System.out.println("Enter sales in the respective month");
            sales[i]=sc.nextInt();
        }
        int sumX=0,sumY=0,sumXY=0,sumXZ=0;
        for(int i=0;i<mo;i++)
        {
            sumX+=months[i];
            sumY+=sales[i];
            sumXY+=months[i]*sales[i];
            sumXZ+=months[i]*months[i];
        }
        double m=(mo*sumXY-sumXY*sumX)/(double)(mo*sumXZ-sumX*sumX);
        double b=(sumY-m*sumX)/mo;
        System.out.println("Enter the month for whose sales you want to predict");
        int nm= sc.nextInt();
        double predictedValue=m*nm+b;
        System.out.println("The predicted value: "+predictedValue);
    }
}