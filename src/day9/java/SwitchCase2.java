package day9.java;

public class SwitchCase2
{
    public static void main(String[] args)
    {
        int marks=67;
        switch (marks)
        {
            case 100:
                System.out.println("Outstanding...");
                break;
            case 88:
                System.out.println("Excellent...");
                break;
            case 73:
                System.out.println("Very Good....");
                break;
            case 67:
                System.out.println("Good...");
                break;
            default:
                System.out.println("Sorry....you couldn't make it...best of Luck for future");

        }
    }
}
