import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i=0;i<100;i++){
            service.execute(new Task());
        }
        System.out.println("thread name: " + Thread.currentThread().getName());
    }

    static class Task implements Runnable {
        public void run(){
            System.out.println("Thread Name:  " + Thread.currentThread().getName());
        }
    }
}
