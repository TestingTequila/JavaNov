package day14.java;

public class Calculations
{
    int a;
    int b;

    int age;
    String name;
    public  void addition(int a, int b)
    {
         this.a=a;
         this.b =b;
    }

    public void method1()
    {
        System.out.println(a);//122
        System.out.println(b);//18
    }
    public  void myDetails(int age, String name)
    {
        this.age=age;
        this.name = name;
    }
    public void method2()
    {
        System.out.println(age);//122
        System.out.println(name);//18
    }




}
