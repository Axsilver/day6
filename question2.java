package training;


public class question2 extends Thread{
	
	public void even() throws InterruptedException
	{
		for(int i = 1; i <= 50; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void odd() throws InterruptedException
	{
		for(int i = 1; i <= 50; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}		
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		question2 thread = new question2();
		thread.start();
		thread.even();
		question2 thread2 = new question2();
		thread2.start();
		thread2.odd();
	}

}

