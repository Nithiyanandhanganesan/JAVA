import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaDemo {
    public static void main(String args[]){
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println("before sorting" + l);
        Collections.sort(l);
        System.out.println("after sorting" + l);

        //Customize sorting(desc) based on Comparator
        Collections.sort(l,(a,b)->(a>b)?-1:(a<b)?1:0);
        System.out.println("lambda desc sorting" +l);


    }
}
