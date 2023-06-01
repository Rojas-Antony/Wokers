package com.pp2;

public class App {

	public static void main(String[] args) {
		worker worker = new worker();
		Thread t1 = new Thread(worker);
		t1.start();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		worker.setTerminated(true);
		System.out.println("finished...");
	}

}
