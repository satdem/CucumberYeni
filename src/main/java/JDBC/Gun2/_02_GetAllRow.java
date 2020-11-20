package JDBC.Gun2;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends _Parent {
    @Test
    public void test1() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from customer");

        int rowCount=1;
        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            //System.out.println(rowCount+"."+firstName + "  " + lastName);
            System.out.printf("%-15s %15s %4\n",firstName,lastName,rs.getRow());

            rowCount++;
        }
        System.out.println("kayıt miktarı= "+ (rowCount-1));

        rs.last();
        int satırSayisi=rs.getRow();//satırın  kaçıncı satır olduğunu söylüyor
        System.out.println("satırSayisi = " + satırSayisi);
    }
   // task:yukarıdaki örneği for ile yapın

    @Test
    public void test2() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from customer");

        rs.last();
        int satırSayisi=rs.getRow();//satırın  kaçıncı satır olduğunu söylüyor

        rs.first();
        for (int i = 1; i <= satırSayisi; i++) {

            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            System.out.println(i+"."+firstName + "  " + lastName);
            rs.next();

        }
        //2.Yol
        /* for (int i = 1; i <= lastrow; i++) {

            rs.absolute(i);
            String firstname=rs.getString("first_name");
            String lastname=rs.getString("last_name");
            System.out.printf("%-15s %-15s %-4d\n", firstname, lastname, rs.getRow());
        }*/

    }

}
