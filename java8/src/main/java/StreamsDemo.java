import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String args[]){

        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        //before streams
        List<Integer> l1 = new ArrayList<>();
        for(Integer i : l){
            if (i%2==0){
                l1.add(i);
            }
        }

        System.out.println(l1);

        //After Streams
        List<Integer> l2 = l.stream().filter(s -> s%2==0).collect(Collectors.toList());

        System.out.println(l2);

        //Perform some operation on inputs
        List<Integer> l3 = l.stream().map(s -> s*s).collect(Collectors.toList());

        System.out.println(l3);

        List<Integer> l4 = l.stream().sorted((a,b)-> -a.compareTo(b)).collect(Collectors.toList());
        System.out.println(l4);

        l.stream().min((a,b)->a.compareTo(b)).get();

        l.stream().forEach(s -> System.out.println(s));

        Integer[] array = l.stream().toArray(Integer[]::new);

        Stream<Integer> s = Stream.of(9,99,999,9999);
        s.count();

        Double d = l.stream().mapToInt(x->x).average().getAsDouble();


        String ss = "hello";
        ss.startsWith("h");
        ss.length();


    }
}
