import java.util.Random;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
            Future<Integer> future =  service.submit(new Task());
            System.out.println("some print");
            Integer result = future.get();
            System.out.println("result" + result);
            System.out.println("some other print");
        System.out.println("thread name: " + Thread.currentThread().getName());
    }

    static class Task implements Callable<Integer> {
        public Integer call() throws InterruptedException {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }
}
