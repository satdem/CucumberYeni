package JDBC.Gun1;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsuluteRelative extends _Parent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from film");

        //absolute verilen satıra gider
        rs.absolute(10);// 10. satıra git
        String title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15);// 15. satıra git
         title=rs.getString("title");
        System.out.println("title = " + title);

         rs.relative(5);// en son bulunduğu yerden 5 satır ileri gider.yani 20. satıra gider
         title=rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(-5);// en son bulunduğu yerden 5 satır geri gider.yani 15. satıra gider
         title=rs.getString("title");
        System.out.println("title = " + title);


    }



}
