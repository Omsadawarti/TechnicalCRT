package com.daaPracticle;

import java.util.Arrays;
import java.util.Scanner;

public class FannysOcc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string ;
        System.out.println("Enter the string:");
        string = scanner.nextLine();

        char ch ;
        System.out.println("Enter the character:");
        ch  = scanner.next().charAt(0);

        char [] chars = new char[string.length()];

        chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ch)
            {
                chars[i]= '*';

            }
        }
String newStr = "";
        for (int i = 0; i < chars.length    ; i++) {
           if(chars[i] == '*')
           {
               continue;
           }
           else
               newStr += chars[i];
        }
        System.out.println(newStr);


    }
}
