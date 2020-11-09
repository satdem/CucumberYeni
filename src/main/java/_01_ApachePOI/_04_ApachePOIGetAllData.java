package _01_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {

    public static void main(String[] args) throws IOException {
        String path="src/main/resources/ApacheExcel1.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

        //çalışma sayfasındaki dolu satırların sayısını veriyor
        int rowCount=sheet.getPhysicalNumberOfRows();
        System.out.println("rowCount = " + rowCount);

        for (int i = 0; i <rowCount ; i++) {  // satır sayısı kadar dönecek
           // int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();//bu aşağıdaki ile aynı
            Row row= sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();//bu satırdaki toplam hücre sayısı alındı

            for (int j = 0; j <cellCount ; j++) {//i.satırdaki hucre sayısı kadar dönecek
                Cell cell= row.getCell(j);
               // System.out.print(cell+" ");
                System.out.printf("%-15s",cell);

            }
            System.out.println();
        }


    }
}
