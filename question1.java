package training;

public class question1 extends Thread{

	public void run()
	{
		for(int i = 1; i <= 50; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		question1 thread = new question1();
		thread.start();
		
	}

}

