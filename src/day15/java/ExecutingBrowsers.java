package day15.java;

public class ExecutingBrowsers
{
    public static void main(String[] args) {
        LaunchBrowser lb = new LaunchBrowser();
        String myBrowser= lb.browser("Abcd");
        if(myBrowser.equals("Edge"))
        {
            System.out.println("Launch Edge Browser...");
        }
        else if (myBrowser.equals("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }

        else if (myBrowser.equals("Firefox"))
        {
            System.out.println("Launch Firefox Browser...");
        }
        else
        {
            System.out.println("Enter a valid browser name....");
        }
    }
}
