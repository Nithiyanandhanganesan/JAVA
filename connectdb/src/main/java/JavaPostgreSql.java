import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaPostgreSql {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "nithiyanandhan";
        String password = "Confident@01";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT col1,col2 from public.test_try")) {


            ArrayList<SamplePOJO> resultList = new ArrayList<SamplePOJO>();
            while (rs.next()) {
                SamplePOJO test = new SamplePOJO();
                test.setCol1(rs.getInt(1));
                test.setCol2(rs.getString(2));
                resultList.add(test);
                //System.out.println(rs.getString(1));
            }
            for (SamplePOJO emp : resultList){
                System.out.println(emp.getCol1());
        }

            st.executeUpdate("update public.test_try1 set col2='h'");
            //System.out.println(resultList.get(0));

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSql.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}