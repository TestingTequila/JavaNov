package day13.java;

public class ExecutingMethods
{
    public static void main(String[] args)
    {
        MethodConcepts mc = new MethodConcepts();
        mc.a=12;
        mc.b=8;
        mc.addition(); //20
        mc.fName = "Daniella";
        mc.lName ="Anaman";
        mc.printFullName(); // null

        MethodConcepts mc2 = new MethodConcepts();
        mc2.a=100;
        mc2.b=350;
        mc2.addition(); //450


    }
}
