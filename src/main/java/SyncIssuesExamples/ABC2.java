package SyncIssuesExamples;

public class ABC2 extends Thread
{
	String name;
	HomeClass home;
	
	ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	public ABC2(HomeClass h, String s)
	{
		this.home = h;
		this.name= s;
	}
	
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			this.home.print(this.name);
		}
	}

}
