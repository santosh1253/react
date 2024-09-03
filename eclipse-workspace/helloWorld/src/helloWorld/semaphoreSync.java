package helloWorld;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class semaphoreSync {
 
	public static void main(String args[])
	{
		Semaphore sem=new Semaphore(5);
		Lock l=new ReentrantLock();
		
	}
}
