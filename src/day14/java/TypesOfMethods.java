package day14.java;

public class TypesOfMethods
{
    //1. methodsWithoutParameters()+methodWithoutReturnType(void)

    ; //Global Variables, Class level Variable

    int a;
    int b;
    public void addition()
    {
        int sum =a+b;
        System.out.println(sum);
    }

    //2. methodsWithParameter(something)+methodWithoutReturnType(void)

    public void addition1(int c,int d)
    {
        int sum =c+d;
        System.out.println(sum);
    }

    public void addition2()
    {
        int c=12;
        int d=38;
        int sum =c+d;
        System.out.println(sum);
    }


}
