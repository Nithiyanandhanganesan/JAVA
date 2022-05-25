import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Create parallelism using Callable & ExecutorService
public class ParallelStep3 {
    static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static  void main(String args[]) throws Exception{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ParallelStep3 obj = new ParallelStep3();

        Future<String> output = executorService.submit(()-> obj.func1());
        Future<String> output1 = executorService.submit(()-> obj.func2());

        String out = output.get();
        String out1 = output1.get();

        System.out.println("total run time:" + stopWatch.getTime());
        System.out.println("func1:" + out + "func2:" + out1);
        executorService.shutdown();

    }

    public String  func1 (){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return "func1";
    }

    public String func2 (){
        try {
            Thread.sleep(2000);
        } catch(Exception e) {
        }
        return "func2";
    }
}
