package testbase;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class close {
	
	private static final String KILL = "taskkill /F /IM ";
	public static boolean isProcessRunning(String serviceName) 
	{
	    Process p;
	    try {
	        p = Runtime.getRuntime().exec("tasklist.exe");
	        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) 
	        {
	            if (line.contains(serviceName)) 
	            {
	                return true;
	            }
	        }
	    }
	    catch (Exception e) 
	    {

	        e.printStackTrace();
	    }
	    return false;
	}
	
	public static void killProcess(String serviceName) 
	{
	    try
	    {
	        Runtime.getRuntime().exec(KILL + serviceName + " /T");
	    } 
	    catch (Exception e) 
	    {

	        e.printStackTrace();
	    }
	}
	
	public static void clearsession()
	{
		
		if (close.isProcessRunning("firefox.exe"))
		{
			close.killProcess("firefox.exe");
			
		}
		if (close.isProcessRunning("geckodriver.exe"))
		{
			
			close.killProcess("geckodriver.exe");
		}
	}
}
