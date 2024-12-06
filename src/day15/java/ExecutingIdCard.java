package day15.java;

public class ExecutingIdCard
{
    public static void main(String[] args) {
        NameOnIdCard nic = new NameOnIdCard();
        String fName=nic.fullName("Ashish", "Mishra");
        System.out.println("Name on Id Card Is : "+fName + nic.lastName());
    }
}
