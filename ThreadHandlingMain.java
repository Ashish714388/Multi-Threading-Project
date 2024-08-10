package practice.multiThreading;

import practice.counter.*;
import practice.threads.*;

public class ThreadHandlingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxThreads = Counter.getMaxNumberOfChildThreads(); //it will give global limit of child threads declared..
		
		Thread [] threads = new Thread[maxThreads];
		
		//create and start the threads...
		
		for(int i = 0; i < maxThreads; i++) {
			
			threads[i] = new IncrementThreads();
			threads[i].start();
		}
		
		//wait for all threads to complete execution and then main thread will be completed..
		for(int i = 0; i < maxThreads; i++) {
			
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread Interrupted " + e.getMessage());
			}
		}
		
		//final count of the child threads created..
		System.out.println("The final count of the child threads created are " + Counter.getCount());
	}

}
