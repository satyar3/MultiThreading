package MultiThreadingUsingThreadClass;

public class MyParentThread extends Thread
{
	/**
	 * 
	 * 1 - Extend Thread class
	 * 2 - override run()
	 * 3 - create instance of thread class
	 * 4 - call start()
	 * 
	 */
	
	@Override
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println("Parent Class Thread");
		}
	}	
	
}
