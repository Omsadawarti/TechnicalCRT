package com.daaPracticle;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ValidPalindromeParagraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String para ;
        System.out.println("Enter the paragraph below:");
        para = scanner.nextLine();

        para = para.toLowerCase();
        char [] paraArray = para.toCharArray();
        String str  = "";
        for (int i = 0 ; i<paraArray.length ; i++)
        {
            if((int)paraArray[i]>= 65 && (int)paraArray[i]<=90 || (int) paraArray[i] >=97 && paraArray[i]<=122)
            {
                str += paraArray[i];
            }
        }

        String oldPara = str;
        char [] reverseArray = str.toCharArray();
        str = "";
        for (int i = reverseArray.length-1; i >=0 ; i--) {
            str+=reverseArray[i];
        }
        System.out.println(str);
        System.out.println(para);
        if(oldPara.equals(str))
        {
            System.out.println("Paragraph is palindrome");
        }
        else
            System.out.println("Paragraph is Not palindrome");
    }
}
