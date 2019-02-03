package MultiThreadingUsingThreadClass;

public class MyChildThread
{
	public static void main(String[] args)
	{
		MyParentThread t1 = new MyParentThread();
		
		t1.start();
	}

}
