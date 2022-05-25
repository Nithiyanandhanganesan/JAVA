import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//Add parallelism using Fork/join method
public class ParallelStep5 extends RecursiveTask<List<Integer>> {
    List<String> list = new ArrayList<>();

    public ParallelStep5(List<String> list) {
        this.list = list;
    }

    public static  void main(String args[]) throws Exception{
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();


        List<String> tempList = new ArrayList<>();
        tempList.add("one");
        tempList.add("two");
        tempList.add("three");
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ParallelStep5 obj = new ParallelStep5(tempList);
        List<Integer> resultList = forkJoinPool.invoke(obj);

       // List<Integer> resultList = new ArrayList<>();


       System.out.println("resultList: " + resultList);
        System.out.println("total run time:" + stopWatch.getTime());
        System.out.println("Done");

    }

    public static int  func1 (String x){
        try {
            Thread.sleep(2000);

        } catch(Exception e) {
        }
        return x.length();
    }

    @Override
    protected List<Integer> compute() {
        if(list.size()<=1){
            List<Integer> resultList = new ArrayList<>();
            list.forEach(x-> resultList.add(func1(x)));
            return resultList;
        }
        int midpoint = list.size();
        ForkJoinTask<List<Integer>> leftInputList = new ParallelStep5(list.subList(0,midpoint)).fork();
        list = list.subList(midpoint,list.size());
        List<Integer> rightResult = compute();
        List<Integer> leftResult = leftInputList.join();
        leftResult.addAll(rightResult);
        return leftResult;
    }
}
