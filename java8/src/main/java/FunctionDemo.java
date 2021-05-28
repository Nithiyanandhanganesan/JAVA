import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String args[]){
        Function<String,Integer> f = (s) -> s.length();
        System.out.println(f.apply("hello"));

        Consumer<String> c = s -> System.out.println(s);
        c.accept("hello");

        Supplier<String> s = () ->  "hello";
        System.out.println(s.get());
    }
}
