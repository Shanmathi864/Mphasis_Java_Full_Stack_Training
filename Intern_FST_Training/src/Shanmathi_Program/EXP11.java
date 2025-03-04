package Shanmathi_Program;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableImpl implements Runnable {
	
	public void run() {
		System.out.println("run() from a different thread than the Main");
	}
}
public class EXP11 {

	static ExecutorService executor = Executors.newFixedThreadPool(2);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableImpl task = new RunnableImpl();
		Thread thread = new Thread(task);
		thread.start();
		executor.submit(task);
		executor.shutdown();
	}

}
