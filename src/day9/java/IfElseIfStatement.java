package day9.java;

public class IfElseIfStatement
{
    public static void main(String[] args)
    {
        int marks = 67;
        if(marks>90)
        {
            System.out.println("Outstanding...you got an O grade");
        }
        else if(marks>80 && marks<=90)
        {
            System.out.println("Excellent....you got an A grade");
        }
        else if (marks<=70 && marks>60)
        {
            System.out.println("Very Good...You got a B grade");
        }
        else if (marks<=50 && marks>60)
        {
            System.out.println("Good...You got a C grade");
        }
        else
        {
            System.out.println("Sorry...you got an F");
        }
    }
}
