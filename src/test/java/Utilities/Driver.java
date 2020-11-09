package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    /**
     * Interview Sorusu
     * Singleton driver nedir?
     * Bütün projede aynı ve tek bir driverın kullanılmasıdır.
     */



    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    //her farklı browser için farklı bir static değişken havuzu oluşturduk

    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadBrowserName.get()==null){
            threadBrowserName.set("chrome");
        }//eğer browser adı gelmezse chrome kullanacak



        //istenen daha önce oluşturulmuş olarak var mı diye soruyorum
        if (threadDriver.get() == null) {

            switch (threadBrowserName.get()) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup(); // System.SetProperty nin karşılığı
                    threadDriver.set( new FirefoxDriver() );
                    break;
                default:
                    WebDriverManager.chromedriver().setup(); // System.SetProperty nin karşılığı
                    threadDriver.set( new ChromeDriver() );
                    break;
            }


        }
        return threadDriver.get();
    }

    public static void quitDriver() {
        if (threadDriver.get() != null) {
            threadDriver.get().quit();//ilgili driver den çıkıldı
            WebDriver driver=threadDriver.get();
            driver = null;//null değeri alınarak boşaltıldı
            threadDriver.set(driver);//threadDriver set edilerek null yapıldı
        }
    }
}
