import java.util.Random;
import java.util.concurrent.*;

public class SingletonExample {

    private static SingletonExample single_instance = null;

    private SingletonExample(){

    }

    public static SingletonExample getInstance() {
        if(single_instance == null)
            single_instance = new SingletonExample();

        return single_instance
    }
}
