package day15.java;

public class ExecutingMarks
{
    public static void main(String[] args) {
        Student std = new Student();
        int marks=std.getStudentMarks("Jason");
        if(marks>=60)
        {
            System.out.println("Congratulations....you got grade A");
        }
        else
        {
            System.out.println("I am sorry...you haven't made it...");
        }
    }
}
