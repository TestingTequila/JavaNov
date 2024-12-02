package day11.java;

import java.util.Arrays;

public class ArraysConcepts2 {
    public static void main(String[] args) {

        //12, 54, 65, 94, 19

        int x =45;
        //System.out.println(x); //45

        int[] numbers = {12, 54, 65, 94, 19};
        System.out.println(numbers.length);// ArrayName.length
        //lowestIndex= 0;
        //HighestIndex= lengthOfArray-1

        //Jason, Roger, Priya, Kerrie, John, Valeri

        String[] students = {"Jason", "Roger", "Priya", "Kerrie", "John", "Valeri", "Tony", "Abhi"};
        System.out.println(students.length);//6

//        System.out.println(students[0]);
//        System.out.println(students[1]);
//        System.out.println(students[2]);
//        System.out.println(students[3]);
//        System.out.println(students[4]);
//        System.out.println(students[5]);

        System.out.println("======WHILE LOOP=========================");
          int i =0;
          while (i<students.length)
          {
              if(students[i].equalsIgnoreCase("John"))
              {

              }
              else {
                  System.out.println(students[i]);
              }
              i++;
          }

        System.out.println("=============FOR LOOP===================");
          for(int j=0; j<students.length; j++)
          {
              if(students[j].equalsIgnoreCase("John"))
              {

              }
              else {
                  System.out.println(students[j]);
              }
          }

        System.out.println("===================Advanced For Loop====");
        for(String s: students)
        {
            if(s.equalsIgnoreCase("John"))
            {

            }
            else {
                System.out.println(s);
            }
        }

        System.out.println("================Display Purpose=============");
        System.out.println(Arrays.toString(students));

    }
}
