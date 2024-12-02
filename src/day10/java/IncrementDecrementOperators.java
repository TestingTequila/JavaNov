package day10.java;

public class IncrementDecrementOperators
{
    public static void main(String[] args)
    {
        //post-increment --> Assign and then increment
        int x= 10;
        int y=x++;
        System.out.println(x);
        System.out.println(y);

        int a =-100;
        int b=a++;
        System.out.println(a);
        System.out.println(b);

        //pre-increment
        int c =100;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        int e =-100;
        int f=++a;
        System.out.println(a);
        System.out.println(b);

        int g=100;

        System.out.println(g++);//100
        System.out.println(g); //101

        int h = 100;
        System.out.println(++h);
        System.out.println(h);

        int x1= 10;
        int y1=x1--;
        System.out.println(x1);
        System.out.println(y1);

        int a1 =-100;
        int b1=a1--;
        System.out.println(a1);
        System.out.println(b1);

        int e1 =-100;
        int f1=--e1;
        System.out.println(e1);
        System.out.println(f1);

    }
}
