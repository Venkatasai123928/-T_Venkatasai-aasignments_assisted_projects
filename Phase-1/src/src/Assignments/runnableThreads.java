package Assignments;

public class runnableThreads extends Thread {

	 
    public static int myCount = 0;
    public runnableThreads(){
         
    }
    public void run() {
        while(runnableThreads.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++runnableThreads.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        runnableThreads mrt = new runnableThreads();
        Thread t = new Thread(mrt);
        t.start();
        while(runnableThreads.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++runnableThreads.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

