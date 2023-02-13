package javaThreading;

public class threadClass extends Thread {
	/*creating a mutlithreadable class using extend Thread class*/
	@Override
	public void run() {
		for(int i=1; i<=5; ++i) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}

}
