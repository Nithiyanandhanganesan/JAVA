public class RunnableDemo implements Runnable {
    public static void main(String args[]){
        System.out.println("first line");
        RunnableDemo obj = new RunnableDemo();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("second line");
        try {
        t1.join();
        }  catch(Exception e){

        }
        System.out.println("third line");

    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("inside run:"+ i);
            } catch(Exception e) {
            }

        }

    }
}
