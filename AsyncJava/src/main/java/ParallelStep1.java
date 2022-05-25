import org.apache.commons.lang3.time.StopWatch;

//This class without any parllelism
public class ParallelStep1 {
    public static  void main(String args[]){
        StopWatch stopWatch = new StopWatch();
        ParallelStep1 obj = new ParallelStep1();
        stopWatch.start();
        obj.func1(); //blocking call
        obj.func2(); //blocking call
        System.out.println("total run time:" + stopWatch.getTime());

    }

    public void func1 (){
        try {
            Thread.sleep(2000);
        } catch(Exception e) {
        }
        }

    public void func2 (){
        try {
            Thread.sleep(2000);
        } catch(Exception e) {
        }
    }

    }
