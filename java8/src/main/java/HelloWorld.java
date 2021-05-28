import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@FunctionalInterface
interface Inter{
    public void m1();
}


public class HelloWorld {

    public static void main(String[] args) {

        Inter i = () -> System.out.println("hello");
        i.m1();
    }
}