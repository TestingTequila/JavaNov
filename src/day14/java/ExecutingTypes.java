package day14.java;

public class ExecutingTypes
{
    public static void main(String[] args) {
        TypesOfMethods tom = new TypesOfMethods();
        tom.a=12;
        tom.b=24;
        tom.addition();//36

        tom.addition1(12, 8); //20

        tom.addition2();//50

        System.out.println("====================================");

        TypesOfMethods tom1 = new TypesOfMethods();
        tom1.a=15;
        tom1.b=20;
        tom1.addition();//35

        tom1.addition1(122,8);//130

        tom1.addition2();//50
    }
}
