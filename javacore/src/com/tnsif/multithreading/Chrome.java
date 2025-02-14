package com.tnsif.multithreading;

public class Chrome extends Thread {
	public void run () {
		System.out.println("Notepad "+Thread.currentThread().getId());

	}

}
