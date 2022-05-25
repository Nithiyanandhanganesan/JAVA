
//func3 throws exception but func2 will not throw the same to func1.
//So, though func2 catch block excutes, it will not throw exception.
//so, func4() got executed
public class JavaExceptionHandle {
    public static void main(String args[]) throws Exception{
        JavaExceptionHandle obj = new JavaExceptionHandle();
        obj.func1();
        obj.funcPart1();
    }

    public void func1() {
        System.out.println("inside func1");
       func2();
       func4();
    }

    public void func2() {
        try{
           func3();
        }
        catch (Exception e){
            System.out.println("catching func2");
        }
    }

    public void func3() throws Exception{
        throw new Exception("func1");
    }

    public void func4() {
        System.out.println("inside func4");
    }

    //Part2

    public void funcPart2Test() throws Exception{
        System.out.println("inside startpart2");
        funcPart1();
    }

    public void funcPart1() throws Exception{
        System.out.println("inside funcpart1");
        funcPart2();
        funcPart4();
    }

    public void funcPart2() throws Exception{
        try{
            funcPart3();
        }
        catch (Exception e){
            System.out.println("catching funcpart2");
            throw new Exception("funcpart2");
        }
    }

    public void funcPart3() throws Exception{
        throw new Exception("funcpart1");
    }

    public void funcPart4() {
        System.out.println("inside funcpart4");
    }
}
