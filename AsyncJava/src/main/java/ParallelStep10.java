import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParallelStep10 {
    public static void main(String args[]){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ParallelStep10 obj = new ParallelStep10();
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);list.add(3);
        List<CompletableFuture<String>> output =
                list.stream()
                        .map(x-> CompletableFuture.supplyAsync(() -> obj.func1()))
                        .collect(Collectors.toList());

        List<String> finalOutput = output.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println("final output: "+ finalOutput);
        System.out.println("total run time:" + stopWatch.getTime());
        System.out.println("Done");


    }


    public String func1 (){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return "hello";
    }

}
