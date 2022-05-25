public class JavaExceptionHandleScenario1 {
    public static void main(String args[]) throws Exception{
        JavaExceptionHandleScenario1 obj = new JavaExceptionHandleScenario1();
        obj.func1();
    }

    public void func1() throws Exception{
        try{
            throw new Exception();
        } catch(Exception e){
            func2();
        }
    }

    public void func2() throws Exception{
        func3();
    }

    public void func3() throws Exception{
        try{
            int x=1/0;
        }  catch(Exception e){
            throw new Exception("func3 throw exception");
        }
    }
}
