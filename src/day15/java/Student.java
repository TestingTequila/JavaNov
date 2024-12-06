package day15.java;

public class Student
{
    int marks=-1;
    public  int getStudentMarks(String name)
    {
        if(name.equals("Jason"))
        {
            marks= 92;
        }
        else if(name.equals("Roger"))
        {
            marks=  76;
        }
        else if(name.equals("Kerrie"))
        {
            marks=  55;
        }

        else if(name.equals("Lee"))
        {
            marks=  33;
        }

        return  marks;
    }
}
