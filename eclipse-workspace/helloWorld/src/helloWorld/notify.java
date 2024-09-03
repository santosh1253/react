package helloWorld;

import java.util.LinkedList;
import java.util.Queue;

public class notify {

	public static void main(String args[])
	{
		Queue<String> q=new LinkedList<>();
		Thread p=new Thread(new producer(q));
		Thread c=new Thread(new consumer(q));
		p.start();
		c.start();
	}
}
class producer implements Runnable
{
private final Queue<String> q;
	
	public producer(Queue<String> q)
	{
		this.q=q;
	}
    public  void produce() throws InterruptedException {
      	synchronized(q)
      	{
      		if(q.size()==10)
      		{
      			System.out.println("producer in waiting state");
      			q.wait();
      		}
      		Thread.sleep(500);
      		System.out.println("Producing data with value:"+q.size());
      		q.add(String.valueOf(q.size()));
      		q.notify();
      	}
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
class consumer implements Runnable
{
	private final Queue<String> q;
	
	public consumer(Queue<String> q)
	{
		this.q=q;
	}
	public  void consume() throws InterruptedException {
      	synchronized(q)
      	{
      		if(q.size()==0)
      		{
      			System.out.println("consumer in waiting state");
      			q.wait();
      		}
      		Thread.sleep(1000);
      		String data=q.remove();
      		System.out.println("consumer consuming data with value:"+data);
      		q.notify();
      	}
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}