package com.IBM_sample_codes;

import java.util.Scanner;

public class Basic_Chatbot {
    public static void chatbot() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, I am your personal chatbot");
        while(true)
        {
            String st= sc.nextLine().toLowerCase();
            if(st.contains("hello")||st.contains("hi"))
                System.out.println("Hi, how can i help you today");
            else if (st.contains("how are you?"))
                System.out.println("I am a chatgpt, right now i am bug free :)");
            else if (st.contains("bye"))
                System.out.println("Good bye, have a nice day");
            else
                System.out.println("Sorry, I dont understand what you meant");
            break;
            }
        sc.close();
    }
}
