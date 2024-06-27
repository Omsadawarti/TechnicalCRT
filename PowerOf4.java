package com.daaPracticle;

import java.util.Scanner;

public class PowerOf4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        float n;
        System.out.println("Enter the number"   );

        n = scanner.nextFloat();

        if(solution(n))
        {
            System.out.println("Power of 4");
        }
        else
            System.out.println("Not a power of 4");


    }

    private static  boolean solution(float n)
    {
        int count = 0;
        while(n>0)
        {
            n/=4.0f;
            if(n == 1)
            {
                count ++;
                break;
            }
        }

        if(count!=0)
        {
            return  true;
        }
        return  false;

    }
}
