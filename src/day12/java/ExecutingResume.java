package day12.java;

public class ExecutingResume
{
    public static void main(String[] args)
    {
        Resume myResume = new Resume();
        myResume.fName="Daniella";
        myResume.lName="Anamen";
        myResume.totalExperience=3;
        myResume.readyForWFO=false;
        myResume.lastSalary = 12000;
        myResume = null;
        //System.out.println(myResume.fName);

//        System.out.println(myResume.fName);
//        System.out.println(myResume.lName);
//        System.out.println(myResume.totalExperience);
//        System.out.println(myResume.readyForWFO);
//        System.out.println(myResume.lastSalary);


        Resume jobResume = new Resume();
        jobResume.fName="Kirubel";
        jobResume.lName ="Andargie";
        jobResume.totalExperience =5;
        jobResume.readyForWFO = true;
        jobResume.lastSalary = 10000;

        //Object without reference variable
        new Resume().fName="Jason";
        new Resume().lName ="Hill";
        new Resume().totalExperience =15;
        new Resume().lastSalary =20000;

        System.gc();

        Resume res1= new Resume();
        res1.fName= "Ashish";
        res1.lName = "Mishra";
        res1.totalExperience =20;
        res1.readyForWFO = false;
        res1.lastSalary = 50000;
        System.out.println("=========BEFORE===================");
        System.out.println(res1.fName);


        res1 = jobResume;
        System.out.println("=====AFTER=================");
        System.out.println(res1.fName);
        jobResume.fName = "Kerrie";
        System.out.println(res1.fName);
        System.out.println(jobResume.fName);

        myResume= jobResume;
        System.out.println(myResume.fName);
        System.out.println(jobResume.fName);
        System.out.println(res1.fName);
    }
}
