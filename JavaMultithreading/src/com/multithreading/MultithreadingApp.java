package com.multithreading;

// basic Java class example to show difference of Multithreading
/*class ReadingTask{
	
	void readPages(){
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("[ReadingTask] Reading Book Pages for Java. Page#" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}*/

// Custom thread class can be created either by extending the predefined Thread class
// or by implementing the Runnable interface.

// 1. Extending
class ReadingTask1 extends Thread{ // now my ReadingTask class is a Thread class
	
	// here run is being overridden from the predefined Thread class
	@Override
	public void run(){
		Thread.currentThread().setName("ReadingTask1Thread");
		System.out.println("ReadingTask1 Thread: " + Thread.currentThread().getName() + " Started.");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("[ReadingTask1] Reading Book Pages for Java. Page#" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ReadingTask1 Thread: " + Thread.currentThread().getName() + " Finished.");
	}
}

// 2. Implementing
class ReadingTask2 implements Runnable{

	// here run is being overridden from the predefined Runnable class
	@Override
	public void run() {
		System.out.println("ReadingTask2 Thread: " + Thread.currentThread().getName() + " Started.");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("[ReadingTask2] Reading Book Pages for Python. Page#" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ReadingTask2 Thread: " + Thread.currentThread().getName() + " Finished.");
	}
}

public class MultithreadingApp {

	public static void main(String[] args) {
		System.out.println("Main Thread: " + Thread.currentThread().getName() + " Started.");
		
		// when extending Thread, you create a direct class
		// so you DON't need to pass it. just directly create it's own object
		// because it's nothing but a Thread Object
		ReadingTask1 readingTask1 = new ReadingTask1(); //ReadingTask is now a Thread class
		
		// when calling start method, Java internally calls the run method
		readingTask1.start();
		
		// when Implementing Runnable, you must tell your 
		// Thread class which class to refer to while creating a new Thread.
		// i.e. Thread(new ReadingTask2());. So make sure to pass!
		Thread readingTask2 = new Thread(new ReadingTask2(), "ReadingTask2Thread"); // here we created a predefined Thread object with a new 
															  						// custom Thread class i.e. ReadingTask2 object passed
															  						// in the constructor
		// when calling start method, Java internally calls the run method
		readingTask2.start();
		
		System.out.println("Main Thread: " + Thread.currentThread().getName() + " Finished.");
	}

}
