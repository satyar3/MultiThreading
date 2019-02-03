package SyncIssuesExamples;

public class ABC extends Thread
{
	String name;
	HomeClass home;
	
	public ABC(HomeClass h, String s)
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
