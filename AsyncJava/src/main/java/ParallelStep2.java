import org.apache.commons.lang3.time.StopWatch;

//Create parallelism using Runnable & Thread
public class ParallelStep2 {
    public static  void main(String args[]){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ParallelStep1 obj = new ParallelStep1();
        Runnable r1 = () -> { obj.func1();};
        Runnable r2 = () -> { obj.func2();};
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch(Exception e){

        }
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
