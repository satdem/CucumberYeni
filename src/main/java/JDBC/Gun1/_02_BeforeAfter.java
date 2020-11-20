package JDBC.Gun1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {

    private Connection connection;
    private Statement statement;
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

    @Test
    private void test1() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from language");// çalıştırıldı sonıçlar rs değişkenine set edildi fakat
        //performans için bütün sonuçlar bir anda rs ye aktarılmıyor.biz komut verdikçe satır satır geliyor

        rs.next(); //göstergeyi sonraki adıma getir orada satır varsa bütün satırı rs ye at

        String name=rs.getString("name");

        System.out.println(name);



        rs.next(); //göstergeyi sonraki adıma getir orada satır varsa bütün satırı rs ye at

       name=rs.getString("name");

        System.out.println(name);

    }
@Test
    private void test2() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from language");// çalıştırıldı sonıçlar rs değişkenine set edildi fakat
        //performans için bütün sonuçlar bir anda rs ye aktarılmıyor.biz komut verdikçe satır satır geliyor

        rs.next();
        String name=rs.getString(2);//indexler 1 den başlıyor colon adı yerine index kullanılabilir
        System.out.println(name);

        rs.next();
        name=rs.getString(2);
        System.out.println(name);

        rs.next();
        name=rs.getString(2);
        System.out.println(name);

    }
@Test
    private void test3() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from language");// çalıştırıldı sonıçlar rs değişkenine set edildi fakat
        //performans için bütün sonuçlar bir anda rs ye aktarılmıyor.biz komut verdikçe satır satır geliyor

        rs.next();//english yazdı
        String name=rs.getString(2);//indexler 1 den başlıyor colon adı yerine index kullanılabilir
        System.out.println(name);

        rs.next();//itallian yazdı
        name=rs.getString(2);
        System.out.println(name);

        rs.previous(); //bir yukarı geri gitti kayıt göstergesi ve english yazdı
        name=rs.getString(2);
       System.out.println(name);

    }


}
