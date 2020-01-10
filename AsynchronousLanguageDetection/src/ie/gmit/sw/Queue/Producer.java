package ie.gmit.sw.Queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Task> queue;

	public Producer(BlockingQueue<Task> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int counter = 0;
		while (counter < 100) {
			Task t = new Task(counter);
			try {
				queue.put(t); // blocking method
				System.out.println("Added-->" + t);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
		}
		try {
			queue.put(new Poison(-1));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
