

@FunctionalInterface
interface Interf{
    public int add(int a , int b);
}

public class LambdaFunctionInterface {
    public static void main(String args[]){
        Interf i  = (a,b) -> a+b ;
        System.out.println(i.add(5,10));
    }
}
