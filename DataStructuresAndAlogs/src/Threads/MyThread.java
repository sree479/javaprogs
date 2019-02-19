package Threads;

public class MyThread implements Runnable {
	String name;
	Thread t;
	int i=0;
	MyThread(String thread) {
		name = thread;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for (i = 10; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}

class MultiThread {
	public static void main(String args[]) {
		new MyThread("One");
		new MyThread("Two");
		new MyThread("Three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}