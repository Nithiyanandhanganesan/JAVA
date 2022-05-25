import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Achieve Parallelism using CompletableFuture
public class ParallelStep4 {

    public static  void main(String args[]) throws Exception{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ParallelStep4 obj = new ParallelStep4();

        CompletableFuture.supplyAsync(() -> obj.func1())
                .thenApply((result)->result.toUpperCase())
                .thenAccept((result) -> {
                    System.out.println("result is " + result);
                })
        .join();
        System.out.println("total run time:" + stopWatch.getTime());
        System.out.println("Done");

    }

    public String  func1 (){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return "func1";
    }
}
