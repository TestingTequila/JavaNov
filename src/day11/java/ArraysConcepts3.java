package day11.java;

import java.util.Arrays;

public class ArraysConcepts3 {
    public static void main(String[] args) {

        int[] numbers = {12, 54, 65, 94, 19}; // Array Literals

        System.out.println("==========WHILE LOOP==============");
        int i =0;
        while (i<numbers.length)
        {
            if(numbers[i]==94)
            {
                System.out.println(numbers[i]+6);
            }
            else {
                System.out.println(numbers[i]);
            }
            i++;
        }

        System.out.println("==========FOR LOOP==============");

        for (int j =0;j<numbers.length;j++)
        {
            if(numbers[j]==65)
            {
                System.out.println(numbers[j]/5);
            }
            else {
                System.out.println(numbers[j]);
            }

        }

        System.out.println("==========ADVANCED FOR LOOP==============");

        for (int k: numbers)
        {
             if(k==12)
             {
                 System.out.println(k*2);
             }
             else
             {
                 System.out.println(k);
             }
        }

        System.out.println("================Display Purpose=============");
        System.out.println(Arrays.toString(numbers));
    }
}
