package SyncIssuesExamples;

public class HomeClass
{
	
	//Add Synchronized keyword to make the method thred safe
	public /*synchronized*/ void print(String name)
	{
		System.out.println("Good Morning :");
		
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
	}
}
