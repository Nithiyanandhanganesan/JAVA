import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemoLambda {
    public static void main(String args[]){
        Callable c = () -> {
          Thread.sleep(3000);
          return new Random().nextInt();
        };

        System.out.println("firstline");
        ExecutorService service = Executors.newFixedThreadPool(10);
        System.out.println("second line");
        Future<Integer> output = service.submit(c);
        for(int i=0 ;i<=10;i++){
            try{
            Thread.sleep((1000));
            } catch(Exception e){}
            System.out.println("third line");
        }
        try{
            System.out.println(output.get());
        } catch (Exception e){

        }
        System.out.println("fourth line");
        service.shutdown();
    }
}
