package practice.counter;

public class Counter {

	private static int count = 0; // static variable to count the number of child threads..
	private static final int max_number_child_threads = 15; // for maximum number of child threads..
	
	//declaring a synchronized method to safely increment the count...
	
	public synchronized static void Increment() {
		
		count++;
	}
	
	//declaring a synchronized method to safely get the count of the child threads...
	
	public synchronized static int getCount() {
		
		return count;
	}
	
	public static int getMaxNumberOfChildThreads() {
		
		return max_number_child_threads; //returns the global limit of child threads that can be created...
	}
}
