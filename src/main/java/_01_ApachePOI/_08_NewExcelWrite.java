package _01_ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        String path="src/main/resources/NewExcel.xlsx";

        //yeni workbook oluştur,sheet row cell oluştur sırasıyla
        XSSFWorkbook workbook=new XSSFWorkbook();//hafızada workbook oluşturuyoruz
        XSSFSheet sheet= workbook.createSheet("calisma sayfasi");//hafızada sayfa oluşturduk
        Row row= sheet.createRow(0);//sayfa var artık, onda satır oluşturduk
        Cell cell= row.createCell(0);//oluşan satırda bir sütun oluşturduk

        cell.setCellValue("baybay");//hafızada yazı yazdık

        //dosyayı açtık hafızadaki bilgileri yazdık
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();//workbook u kapatırsak iyi olur
        outputStream.close();//dosyayı kapattık

    }
}
