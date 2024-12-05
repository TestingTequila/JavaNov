package day14.java;

public class Employee
{
    String fName;//Jason
    String lName;//Roger
    int age;// 31
    double salary; //

    public  void myDetails(String fName, String lName, int age, double salary)
    {
        this.fName =fName;
        this.lName = lName;
    }

    public  void printDetails()
    {
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(age);
        System.out.println(salary);
    }
}
