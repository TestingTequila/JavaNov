package day15.java;

public class ReturnTypeConcept
{
    public void addition1(int a, int b)
    {
        int sum =a+b;
        System.out.println(sum);
    }

    public boolean addition2(int a, int b)
    {
        boolean flag = false;

        int sum =a+b;
        if(sum>20)
        {
            flag= true;
        }
        return flag;
    }
}
