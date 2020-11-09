package _01_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_GetColumnAllData {
/*
* LoginData.xlsx i kullanarak istenilen kolondaki bilgileri
* ekrana yazdıran programı metod kullanarak yazdırınız.
* metod kolon numarası alsın
*
* */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Aradığınız kolon numarasını yazınız:");
        int colNo=sc.nextInt();

        List<String> donenList=getColumn(colNo);
        System.out.println(donenList);


    }
    public static List<String> getColumn(int colNo){
        List<String> listCol=new ArrayList<>();
        String path="src/main/resources/LoginData.xlsx";

        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Workbook workbook= null;
        try {
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet=workbook.getSheet("Login");
        int rowCount=sheet.getPhysicalNumberOfRows();

        Row row;
        for (int i = 0; i < rowCount; i++) {
            int celllCount = sheet.getRow(i).getPhysicalNumberOfCells();

            row = sheet.getRow(i);
            if (colNo < celllCount) {
                Cell cell = row.getCell(colNo);
               listCol.add(cell.toString());

            }

        }
        return listCol;
    }
}
