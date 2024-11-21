package com.multithreading;

class Printer{
	
	String status = "Available";
	// Synchronized method
//	synchronized void printDocument(String docName, int copies) {
		
	void printDocument(String docName, int copies) {
		
		status = "Busy";
		
		System.out.println("[Printer] Printing the document: " + docName);
		
		showPrinterStatus();
		
		for(int i = 1; i <= copies; i++) {
			System.out.println("[Printer] " + docName + " copy#" + i + "...");
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		status = "Available";
		showPrinterStatus();
	}
	
	void showPrinterStatus() {
		System.out.println("[Printer] Status: " + status + "\n");
	}
}

class Laptop extends Thread{
	
	Printer pref;
	
	void attachPrinter(Printer p) {
		pref = p;
	}
	
	@Override
	public void run() {
		// Synchronized block
		synchronized (pref) {
			pref.printDocument(">> John_Resume.pds", 10);
		}
	}
}

class Desktop extends Thread{
	
	Printer pref;
	
	void attachPrinter(Printer p) {
		pref = p;
	}
	
	@Override
	public void run() {
		// Synchronized Block
		synchronized (pref) {
			pref.printDocument(">> Sam_Resume.pds", 10);
		}
	}
}

public class SynchronizationApp {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
//		printer.showPrinterStatus();
//		printer.printDocument("LearningJava.pdf", 10);
//		printer.showPrinterStatus();
		
		Laptop laptop = new Laptop();
		laptop.attachPrinter(printer);
		
		Desktop desktop = new Desktop();
		desktop.attachPrinter(printer);
		
		laptop.start();
		desktop.start();
	}

}
