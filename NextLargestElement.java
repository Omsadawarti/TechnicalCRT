package com.daaPracticle;


import java.util.*;

public class NextLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of array:");
        size = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(size);

        System.out.println("Enter elements in array:");
        for (int i = 0; i < size; i++) {
            int take = scanner.nextInt();
           arrayList.add(take);
        }

        for (int i = 0; i < arrayList.size(); i++) {
                int result = returnLargest(arrayList.get(i), arrayList);
            System.out.println(arrayList.get(i)+":"+result);
        }

    }
    private static int returnLargest(int i , ArrayList<Integer> arrayList)
    {
         int start = arrayList.indexOf(i);
        for (int j = start; j < arrayList.size(); j++) {
            if(arrayList.get(j) > i)
            {
                return arrayList.get(j);
            }
        }
        return -1;// default value;
    }

}
