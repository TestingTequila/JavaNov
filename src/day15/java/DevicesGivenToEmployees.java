package day15.java;

public class DevicesGivenToEmployees
{
    String[] devices= null;
    public  String[] devicesAllotted(String empName)
    {
        if(empName.equals("Jason"))
        {
            devices = new String[]{"Macbook", "iph13"};
        }
        else if (empName.equals("Roger"))
        {
            devices = new String[]{"vodafone Sim", "Samsung s18", "Mac Laptop", "Adaptor"};
        }
        else if (empName.equals("Sen"))
        {
            devices =new String[] {"Samsung s18", "Mac Laptop", "Adaptor"};
        }
        else
        {
            System.out.println("Provide the correct name of Employee...");
        }
        return devices;
    }
}
