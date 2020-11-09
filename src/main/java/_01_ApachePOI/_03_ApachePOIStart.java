package _01_ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        String path="src/main/resources/ApacheExcel1.xlsx";

        //dosyayı (exceli) okumaya açtım
        FileInputStream dosyaOkumaYolu=new FileInputStream(path);

        //Bunun üzerinden çalışma kitabını alıyorum
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaYolu);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");
        Sheet calismaSayfasiAyni=calismaKitabi.getSheetAt(0);//yukarıdaki ile aynı

        //istenen satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);

        //istenen satırdaki istenen hücre(sütun) alınıyor
        Cell hucre=satir.getCell(0);

        System.out.println(hucre);



    }
}
