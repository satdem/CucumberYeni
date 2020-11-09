package _01_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {


        String path="src/main/resources/WriteInTheExcelFile.xlsx";
        //dosya okuma işlemleri
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        //hafıza yazma işlemleri
        Row row=sheet.createRow(0);//0. satırı oluşturdum
        Cell cell=row.createCell(0);//0.satırdaki 0. sütunu(hücreyi) oluşturdum

        cell.setCellValue("hello world");
        inputStream.close();//okuma işlemi kapatıldı(bilgi girişi:input)

        //yazma işlemi için  exceli yazma moduna açıyorum(output:bilgiÇıkışı)
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        outputStream.close();


    }
}
