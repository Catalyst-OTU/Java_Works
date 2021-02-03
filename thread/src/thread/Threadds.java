package thread;

public class Threadds extends Thread implements Runnable {
	
	
	public void finalize() {
		
		System.out.println("Gabbage Collector");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private String message;
//
//	public Threadds(String msg) {
//		
//		this.message = msg;
//	}
//	
//	public void run() {
//		
//	System.out.println(Thread.currentThread().getName()+ "  "+ "(Start) message" + message);
//	
//	sleepThread();
//	
//	System.out.println(Thread.currentThread().getName() + "  "+ "(End) message");
//	}
//	
//	public void sleepThread() {
//		
//		try {
//			
//			Thread.sleep(3000);
//			
//		}catch(Exception e) {
//			
//			System.out.println(e);
//		}
//		
//	}

}
