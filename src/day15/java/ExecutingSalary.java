package day15.java;

public class ExecutingSalary
{
    public static void main(String[] args) {
        EmployeeSalary es = new EmployeeSalary();
        int empSalary =es.calculateSalary(3000, 4000);
        int salaryWithBonus=empSalary + es.christmasBonus();
        System.out.println(salaryWithBonus);
    }
}
