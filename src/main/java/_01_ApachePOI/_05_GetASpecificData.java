package _01_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpecificData {
/*
* Verilen exceldeki password bilgisini bir method yardımı ile yazdırınız
* yanii methoda password kelimesi gönderilecek ,dönen değer passwordun kendisi olacak
*
* */
    public static void main(String[] args) throws IOException {



       stringInfo("Password");
       //2.Yolun mainKısmı
        Scanner sc=new Scanner(System.in);
        System.out.print("Aradığınız kelimeyi yazınız:");
        String arananKelime=sc.nextLine();
        String donenKelime=bul(arananKelime);
        System.out.println( donenKelime);



    }
  static void stringInfo(String hucreName) throws IOException {
        String path="src/main/resources/LoginData.xlsx";

        FileInputStream dosyaOkumaYolu=new FileInputStream(path);

        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaYolu);

        Sheet calismaSayfasi=calismaKitabi.getSheet("Login");


      Row satir;
      Cell hucre;

      switch (hucreName) {
          case "Username":
          satir = calismaSayfasi.getRow(0);
           hucre = satir.getCell(1);
          System.out.println(hucre);break;
          case "Password":
          satir = calismaSayfasi.getRow(1);
        hucre = satir.getCell(1);
          System.out.println(hucre);break;
          case "Address":
           satir = calismaSayfasi.getRow(2);
           hucre = satir.getCell(1);
          System.out.println(hucre);break;
          case "Zipcode":
        satir = calismaSayfasi.getRow(3);
         hucre = satir.getCell(1);
          System.out.println(hucre);break;
   case "Cty":
        satir = calismaSayfasi.getRow(4);
         hucre = satir.getCell(1);
          System.out.println(hucre);break;
   case "State":
        satir = calismaSayfasi.getRow(5);
         hucre = satir.getCell(1);
          System.out.println(hucre);break;

      }

    }
    //2.YOL
    static String bul(String arananKelime) {
        String donecekKelime="";
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
        for (int i = 0; i < rowCount; i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(arananKelime)){
                int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();

                for (int j = 0; j <cellCount ; j++) {
                    donecekKelime+=sheet.getRow(i).getCell(j).toString()+" ";

                }
                   break;
            }

        }


        return donecekKelime;
    }
}
