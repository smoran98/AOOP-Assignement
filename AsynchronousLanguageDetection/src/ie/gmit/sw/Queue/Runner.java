package ie.gmit.sw.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Task> q = new ArrayBlockingQueue<>(5);
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		new Thread(p).start();
		new Thread(c).start();
	}

}
