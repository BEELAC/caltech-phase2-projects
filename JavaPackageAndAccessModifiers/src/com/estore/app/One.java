package com.estore.app;

// public class - visible through out entire project & folders
public class One {
	
	public static void main(String[] args) {
		System.out.println("Hi");
	}
	
	// we have access to all the modifiers before the class attributes
	private int a;
	int b;
	protected int c;
	public int d;
	
	// we have access to all the modifiers before the class functions 
	private void showPrivate() {
		System.out.println("[One] This is a private function");
	}
	
	void showDefault() {
		System.out.println("[One] This is a default function");
	}
	
	protected void showProtected() {
		System.out.println("[One] This is a protected function");
	}
	
	public void showPublic() {
		System.out.println("[One] This is a public function");
	}
}

// default class - only visible within the package in which it is created
class Two{
	// we have access to all the modifiers before the class attributes
	private int a;
	int b;
	protected int c;
	public int d;
	
	// we have access to all the modifiers before the class functions 
	private void showPrivate() {
		System.out.println("[Two] This is a private function");
	}
	
	void showDefault() {
		System.out.println("[Two] This is a default function");
	}
	
	protected void showProtected() {
		System.out.println("[Two] This is a protected function");
	}
	
	public void showPublic() {
		System.out.println("[Two] This is a public function");
	}
}

// not permitted
//private class Three{
//	
//}

// not permitted
//protected class Four{
//	
//}