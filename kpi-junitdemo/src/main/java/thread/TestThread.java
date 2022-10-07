package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {
	public static void main(final String[] arguments) throws InterruptedException{
		Executor executor=Executors.newCachedThreadPool();
		executor.execute(new Task());
		ThreadPoolExecutor pool=(ThreadPoolExecutor)executor;
		pool.shutdown();
	}

static  class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//Math.random generates a random or runtime value everytime
//It takes the control from developer’s hand and hands it over to the ocmpiler
//line 14 to 17 there is system gap
			Long duration=(long)(Math.random()*5);
			System.out.println("running task !");
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Task Complete");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
		
	}

}
