package SyncIssuesExamples;

public class Runner
{
	public static void main(String[] args)
	{
		HomeClass h = new HomeClass();
		
		ABC t1 = new ABC(h, "Raman");
		t1.start();
		
		ABC t2 = new ABC(h, "Raman");
		t2.start();
		
	}	
}
