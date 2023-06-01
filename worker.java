package com.pp2;

public class worker implements Runnable{
	private boolean isTerminated = false;
	
	@Override
	public void run() {
		while (!isTerminated) {
			System.out.println("Hello from worker class...");
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isTerminated() {
		return isTerminated;
	}
	
	public void setTerminated (boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
}