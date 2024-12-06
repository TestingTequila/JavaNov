package day15.java;

public class LaunchBrowser
{
    String browserType = "";
    public  String browser(String browserName)
    {
        switch (browserName)
        {
            case "Chrome":
                browserType =browserName;
                break;
            case "Edge":
                browserType = browserName;
            break;
            case "Firefox":
                browserType = browserName;
            break;
            default:
                return browserType;
        }
        return browserType;
    }
}
