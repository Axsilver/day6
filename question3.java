package training;

class Printer
{
	public void print( int n)
	{
		
		for(int i = n; i <= 50; i+=2)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
				
				try 
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					
				}
			}
			else
			{
				System.out.println(i);
				
				try 
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					
				}
			}
		}
	}
}

class MyThread extends Thread
{
	Printer printer;
	int start;
	MyThread(Printer pr, int st)
	{
		printer = pr;
		start = st;
	}
	
	public void run()
	{
		printer.print(start);
	}
}


public class question3 extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		MyThread thread = new MyThread(printer, 1);
		thread.start();
		MyThread thread2 = new MyThread(printer, 2);
		thread2.start();
		
		try
		{
			thread.join();
			thread2.join();
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
