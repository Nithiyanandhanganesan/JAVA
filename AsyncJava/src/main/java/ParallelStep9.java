import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.CompletableFuture;

//Exception Handling
public class ParallelStep9 {

    public static void main(String args[]){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.println("total run time:" + stopWatch.getTime());
        System.out.println("Done");


    }


    public String helloWorldAsync(){
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(()-> func1());
        CompletableFuture<String> world = CompletableFuture.supplyAsync(()-> func2());

        /*return hello.
                handle((res, e) -> {
                    System.out.println(e);
                    return "";
                })
                .thenCombine(world,(h,w) -> h+w).thenApply(x->x.toUpperCase()).join();*/

        return hello.
                exceptionally((e) -> {
                    System.out.println(e);
                    return "";
                })
                .thenCombine(world,(h,w) -> h+w).thenApply(x->x.toUpperCase()).join();
    }

    public String  func1 (){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return "hello";
    }

    public String  func2 (){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return "world";
    }
}
