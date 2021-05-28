import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String args[]){
        Predicate<Integer> p = I -> I>10;
        System.out.println(p.test(100));

        Predicate<Integer> pp = I -> I>10;
        System.out.println(pp.test(100));

        Predicate<String> p1 = s -> s.length()>5;
        System.out.println(p1.test("test"));

        Predicate<Collection> p2 = c -> c.isEmpty();
        List<Integer> l = new ArrayList<>();
        l.add(10);
        System.out.println(p2.test(l));

        System.out.println(p.and(pp));

    }
}
