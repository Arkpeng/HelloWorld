package Threads;

public class ThreadTest extends Thread{
	
	public void run() {
		for(int count=10;count>=0;count--) {
			System.out.print(count+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ThreadTest().start();
	}

}
