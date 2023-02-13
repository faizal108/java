package javaThreading;

public class main {

	public static void main(String[] args) {
		
		
//		use the thread using extends thread class
		threadClass tc = new threadClass();
		threadClass tc2 = new threadClass();
		
		/*this will not work as thread
		this simply wait till run process is not completed!!*/
		tc.run();
		System.out.println("After run!!");
		
		/*This will run this run() method from thredClass and procced
		 further without waiting*/
		tc.start();
		System.out.println("After start tc1!!");
		tc2.start();
//		this below method join() is use to stop execution till the thread is not die.
		try {
			tc2.join();
		}catch(InterruptedException e) {
			System.err.println(e.toString());
		}
//		this below method isAlive() is use to get state of thread active or dead.[True || False]
		System.out.println("thread 2 is alive : "+ tc2.isAlive());
		System.out.println("After start tc2!!");
		
		
//		use the thread using runnable interface
		threadInterface ti = new threadInterface();
		Thread th = new Thread(ti);
		th.start();
	}

}
