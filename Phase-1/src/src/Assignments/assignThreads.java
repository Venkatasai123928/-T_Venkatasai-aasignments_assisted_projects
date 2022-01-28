package Assignments;

public class assignThreads extends Thread {
	
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		assignThreads mt = new assignThreads ();
	  		mt.start();
	 	}
	}


