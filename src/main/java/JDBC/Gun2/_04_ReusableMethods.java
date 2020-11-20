package JDBC.Gun2;

import JDBC._Parent;
import gherkin.lexer.Ar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class _04_ReusableMethods extends _Parent {

    public static void main(String[] args) throws SQLException {
        //verilen bir sorguya ait bütün bilgileri bir liste atarak geri döndüren methodu yazınız
        List<List<String>> list=ReusableMethods("select * from film");
        System.out.println(list);


    }
    public static List<List<String>> ReusableMethods(String name) throws SQLException {

         Connection connection;
         Statement statement;
        String url = "jdbc:mysql://test.medis.mersys.io:33306/sakila";
        // Veritabanına ulaşabilmek için JDBC ye : db nini tipi (mysql), db nin yolu (test.medis.mersys.io)
        // db nin bulunduğu bilgisayarın içindeki mysql db nin port numarası (33306) ve db nin adı verildi.
        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        connection= DriverManager.getConnection(url,username,password);
        statement=connection.createStatement();//sorgularımı gönderebilmek için yol oluştur

        List<List<String>> list=new ArrayList<>();
        ResultSet rs = statement.executeQuery(name);

        ResultSetMetaData rsmd = rs.getMetaData();
        int coullmnCount = rsmd.getColumnCount();

        System.out.println(coullmnCount);

        int i=1;
        while (rs.next()) {
            for (List<String> l:list) {

                l.add(rs.getString(i));
            }

            i++;
        }

        return list;
    }
}   //bu metodu ben yazdım çoğu eksik

