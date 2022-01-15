package Thread.program;

class Line{
	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(300);  
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Train extends Thread
{
	Line line;

	Train(Line line)
	{
		this.line = line;
	}

	public void run()
	{
		line.getLine();
	}
}

public class synchonized {
	
	public static void main(String[] args)
	{
	
		Line obj = new Line();

		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		
		train1.setName("Train 1");
		train2.setName("Train 2");

		train1.start();
		train2.start();
	}

	}

