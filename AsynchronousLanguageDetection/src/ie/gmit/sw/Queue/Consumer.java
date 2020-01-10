package ie.gmit.sw.Queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Task> queue;
	private volatile boolean keepRunning = true;
	public Consumer(BlockingQueue<Task> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (keepRunning) {
			try {
				Task t = queue.take();
				
				if (t instanceof Poison) {
					keepRunning = false;
					System.out.println("Queue poisoning-->" + t);
				}
				
				System.out.println("Removing" + t);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
