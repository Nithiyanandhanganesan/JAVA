public class RunnableDemoLambda  {
    public static void main(String args[]){
        System.out.println("starting");
        Runnable r  = () -> {
            try{
                Thread.sleep(1000);
                for(int i=0;i<=10;i++){
                    System.out.println("inside run:"+i);
                }
            }catch (Exception e){
            }
        };

        System.out.println("firstline");
        Thread t = new Thread(r);
        System.out.println("second line");
        t.start();
        System.out.println("third line");
        try{
            t.join();
        } catch (Exception e){

        }
        System.out.println("fourth line");

    }
}
