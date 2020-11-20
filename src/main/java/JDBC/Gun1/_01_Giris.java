package JDBC.Gun1;
import  org.testng.annotations.Test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_Giris {

    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();//sorgularımı gönderebilmek için yol oluştur

        ResultSet rs= statement.executeQuery("select * from actor");// çalıştırıldı sonıçlar rs değişkenine set edildi fakat
        //performans için bütün sonuçlar bir anda rs ye aktarılmıyor.biz komut verdikçe satır satır geliyor

        rs.next(); //göstergeyi sonraki adıma getir orada satır varsa bütün satırı rs ye at

        String firstName=rs.getString("first_name");
        String lastName=rs.getString("last_name");
        System.out.println("Name = " + firstName+" "+lastName);



        rs.next();
        firstName=rs.getString("first_name");
        lastName=rs.getString("last_name");
        System.out.println("Name = " + firstName+" "+lastName);

        connection.close();



    }
}
