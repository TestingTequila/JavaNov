package day15.java;

import java.util.Arrays;

public class ExecutingDevices
{
    public static void main(String[] args) {
        DevicesGivenToEmployees dgte = new DevicesGivenToEmployees();
        String[] companyDevices= dgte.devicesAllotted("Ashish");
        System.out.println(Arrays.toString(companyDevices));

    }
}
