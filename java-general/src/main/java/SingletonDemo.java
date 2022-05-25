class SingletonDemo {
//not working need to check
    private String s;
    private SingletonDemo(){
        s= "test";
    }

    public static void main(String args[]){
        SingletonDemo obj1 = new SingletonDemo();
        SingletonDemo obj2 = new SingletonDemo();
        obj1.s = (obj1.s).toUpperCase();
        System.out.println(obj1.s);
        System.out.println(obj2.s);

    }
}