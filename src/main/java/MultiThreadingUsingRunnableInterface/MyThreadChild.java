package MultiThreadingUsingRunnableInterface;

public class MyThreadChild
{
	public static void main(String[] args)
	{
		MyThreadParent p = new MyThreadParent();
		Thread t1 = new Thread(p);
		t1.start();
	}
}
