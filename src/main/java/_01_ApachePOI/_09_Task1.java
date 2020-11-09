package _01_ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Task1 {
    /*
    * çarpım tablosunu excele yazdırınız
    *  1x1=1 şeklinde işaretleride yazdırın
    * */
    public static void main(String[] args) throws IOException {
        String path="src/main/resources/Task1.xlsx";

        //yeni workbook oluştur,sheet row cell oluştur sırasıyla
        XSSFWorkbook workbook=new XSSFWorkbook();//hafızada workbook oluşturuyoruz
        XSSFSheet sheet= workbook.createSheet("sayfa");//hafızada sayfa oluşturduk


            int rowCount=0;

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10; j++) {

                Row row = sheet.createRow(rowCount++);
                Cell cell = row.createCell(0);
                cell.setCellValue(i);

                cell = row.createCell(1);
                cell.setCellValue(" x ");

                cell = row.createCell(2);
                cell.setCellValue(j);

                cell = row.createCell(3);
                cell.setCellValue(" = ");

                cell = row.createCell(4);
                cell.setCellValue(i*j);


            }

        }
        //dosyayı açtık hafızadaki bilgileri yazdık
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();//workbook u kapatırsak iyi olur
        outputStream.close();//dosyayı kapattık


    }
}
