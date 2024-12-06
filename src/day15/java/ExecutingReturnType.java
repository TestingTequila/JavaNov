package day15.java;

public class ExecutingReturnType
{
    public static void main(String[] args) {
        ReturnTypeConcept rtc = new ReturnTypeConcept();
        //int num1=rtc.addition1(12,4);//16 (void)

        boolean num2 =rtc.addition2(12,18);//16 (int)
        System.out.println(num2);
        // System.out.println(num2*5); //100


    }
}
