package day14.java;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.fName ="Kirubel";
        emp.lName="Andargie";
        emp.age=31;
        emp.myDetails("Jason", "Roger", 44, 3456.65);

        emp.printDetails(); //fName, lName, age, Salary
    }
}
