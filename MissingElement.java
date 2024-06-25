package com.daaPracticle;


import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
            Scanner scanner  = new Scanner(System.in);
            int size;
        System.out.println("Enter the size:");
        size = scanner.nextInt();
        int [] arr = new int[size - 1   ];

        System.out.println("Enter elements one by one:");

        for (int i = 0; i < size -1; i++) {
            arr[i] = scanner.nextInt();
        }


        // sorting the input array.

        for (int i = 0; i < arr.length ; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j])
                {
                        temp  = arr[i];
                        arr[i] = arr[j];
                        arr[j]  =  temp;
                }
            }
        }

        for(int i = 1 ; i<=size ; i++)
        {
            boolean result = binarySearch(i,arr);
            if(result)
            {
                continue;
            }
            else
            {
                System.out.println("Missing number is: "+i);
                break;
            }
        }


    }

    private static boolean binarySearch(int i , int [] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;
            if(i ==  arr[middle])
            {
                return true;
            }
            else if( i < arr[middle])
            {
                end = middle -  1;
            }
            else
                start =  middle + 1;

        }

        return  false ;
    }
}
