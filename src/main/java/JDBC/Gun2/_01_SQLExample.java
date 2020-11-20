package JDBC.Gun2;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SQLExample extends _Parent {

    @Test
    public  void relativeExample() throws SQLException {
       ResultSet rs= statement.executeQuery("select * from city");

       rs.relative(5);
       String cityName=rs.getString(2);
        System.out.println("cityName = " + cityName);

         rs.relative(6);
        cityName=rs.getString(2);
        System.out.println("cityName = " + cityName);

    }


    @Test
    public void lastFirstKeyword() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from city");

        rs.last();// en son satıra gidiyor
        String cityName=rs.getString("city");
        Integer countryId=rs.getInt("country_id");

        System.out.println(cityName+" -- "+countryId);

        rs.first();// ilk satıra gidiyor
        cityName=rs.getString("city");
        countryId=rs.getInt("country_id");

        System.out.println(cityName+" -- "+countryId);
    }
    //adresteki district alanını önce 10. satır sonra 22 satırdaki
    // sonra en son satırdaki bilgiyi yazdırınız

    @Test
    public void ornek() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from address");

        rs.absolute(10);
        String district=rs.getString("district");
        System.out.println( district);

        rs.absolute(22);
        district=rs.getString("district");
        System.out.println( district);

        rs.last();
        district=rs.getString("district");
        System.out.println( district);
    }

}
