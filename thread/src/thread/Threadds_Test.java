package thread;

import java.util.concurrent.*;

public class Threadds_Test {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadGroup tg = new ThreadGroup("Group one");
		
		Threadds ts = new Threadds();
		
		Thread t1 = new Thread(tg, ts, "One");
		t1.start();
		Thread t2 = new Thread(tg, ts, "Two");
		t2.start();
		Thread t3 = new Thread(tg, ts, "Three");
		t3.start();
		
		System.out.println("ThreadGroup name "+ tg.getName());
		
	    tg.list();
		
		
}	
		
		
		
	
		
		
//		ExecutorService exec = Executors.newFixedThreadPool(5);
//		
//		for(int i = 0; i < 20; i++) {
//			
//			Threadds t = new Threadds("M" + i);
//			
//			exec.execute(t);
//		}
//		
//		exec.shutdown();
//		
//		System.out.println("We have Shutdown");
//
//	}


}