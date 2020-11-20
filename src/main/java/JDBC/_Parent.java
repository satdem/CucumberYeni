package JDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _Parent {

    public Connection connection;
    public static Statement statement;
    @BeforeTest
    public void beforeTest() throws SQLException {

        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        connection= DriverManager.getConnection(url,username,password);
        statement=connection.createStatement();//sorgularımı gönderebilmek için yol oluştur


    }
    @AfterTest
    public  void afterTest() throws SQLException {
        connection.close();
    }

}
