import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Parallel Streams API
public class ParallelStep6 {
    public static void main(String args[]){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String> inputList = new ArrayList<>();
        inputList.add("one");
        inputList.add("two");
        inputList.add("three");
        ParallelStep6 obj = new ParallelStep6();
        List<Integer> resultList = obj.stringTransform(inputList);
        System.out.println("resultList: " + resultList);
        System.out.println("total run time:" + stopWatch.getTime());

    }

    public List<Integer> stringTransform(List<String> list){
        return list.parallelStream().map(x -> func1(x)).collect(Collectors.toList());
        //return list.stream().map(x -> func1(x)).collect(Collectors.toList());
    }

    public static int  func1 (String x){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return x.length();
    }

}
