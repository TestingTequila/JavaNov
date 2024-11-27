package day9.java;

public class IfElseIfStatement2
{
    public static void main(String[] args) {

        String day = "Wednesday";

        if(day=="Monday")
        {
            System.out.println("I will go to Office");
        }
        else if (day=="Tuesday")
        {
            System.out.println("I will go to Church");
        }
        else if (day=="Wednesday")
        {
            System.out.println("I will visit my Family");
        }
        else if (day=="Thursday")
        {
            System.out.println("I will visit my Friends");
        }
        else if (day=="Friday")
        {
            System.out.println("I will go for Movie");
        }
        else
        {
            System.out.println("Wow...its weekend...lets Party");
        }
    }
}
