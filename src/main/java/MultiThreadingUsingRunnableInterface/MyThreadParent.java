package MultiThreadingUsingRunnableInterface;

public class MyThreadParent  implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println("Parent Class");
		}
	}
}
