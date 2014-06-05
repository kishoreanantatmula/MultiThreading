
public class Threaddemo extends Thread {
	
	
	public void run()
	{
		
		for(int i = 0;i<5;i++)
		{
			
			//Lets see if Child Thread or Main Thread runs first
			// ok some more things to commit
			
			try {
				Thread.sleep(1000);
				System.out.println("Child Thread");
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
			
		}
		
				
		
	}
	
	
	public static void main(String args[])
	{
		
		Threaddemo t  = new Threaddemo();
		
		t.start();
		
		for(int i = 0;i<5;i++)
		{
			
			try {
				Thread.sleep(1000);
				System.out.println("Main Thread");
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			
		
		 
	}

	
	
	
	}
}
