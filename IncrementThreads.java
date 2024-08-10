package practice.threads;

import practice.counter.*;

public class IncrementThreads extends Thread { //Child thread that increment the count variable in synchronized method..

	//over-ride the run method...
	public void run() {
		
		//increment the counter
		Counter.Increment();
		System.out.println("Thread " + Thread.currentThread().getName() + " incremented the counter..");
	}
}
