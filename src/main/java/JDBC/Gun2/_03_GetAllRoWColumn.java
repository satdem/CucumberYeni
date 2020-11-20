package JDBC.Gun2;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRoWColumn extends _Parent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();//sorgu listesine ait temel bilgilere ulaşabiliyoruz bu fonksiyon ile
        int coullmnCount = rsmd.getColumnCount();//column sayısına ulaştık

        System.out.println(coullmnCount);

        while (rs.next()) {
            for (int i = 1; i <= coullmnCount; i++) {

                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }

    }

    //task1: film tablosundaki bütün filmleri listeleyiniz
    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");

        ResultSetMetaData rsmd = rs.getMetaData();
        int coullmnCount = rsmd.getColumnCount();

        System.out.println(coullmnCount);

        while (rs.next()) {
            for (int i = 1; i <= coullmnCount; i++) {

                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }


    }

    //task1: film tablosundaki bütün filmleri düzenli bir şeklide listeleyiniz
    @Test
    public void test3() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");

        ResultSetMetaData rsmd = rs.getMetaData();
        int coullmnCount = rsmd.getColumnCount();

        System.out.println(coullmnCount);

        while (rs.next()) {
            for (int i = 1; i <= coullmnCount; i++) {

                System.out.printf("%s  ",rs.getString(i) + " ");
            }
            System.out.println();
        }

    }
}