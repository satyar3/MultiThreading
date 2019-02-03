package SyncIssuesExamples;

public class Runner2
{
	public static void main(String[] args)
	{
		HomeClass h = new HomeClass();
		
		ABC2 t1 = new ABC2(h, "Raman");
		t1.start();
		t1.threadLocal.set("10");
		System.out.println("from 1st Thread "+t1.threadLocal.get());
		
		ABC2 t2 = new ABC2(h, "Raman");
		t2.start();
		System.out.println("from 1st Thread "+t2.threadLocal.get());
		
	}	
}
