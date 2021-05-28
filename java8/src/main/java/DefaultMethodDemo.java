interface inter1{

    default void m1(){
        System.out.println("inside interface");
    }

    public static void m2(){
        System.out.println("static metod");
    }
}

public class DefaultMethodDemo implements  inter1{

    public void m1(){
        System.out.println("inside class");
    }

    public static void main(String args[]){
        DefaultMethodDemo d = new DefaultMethodDemo();
        d.m1();
        inter1.m2();

    }
}
