package brComFrame.util;

import brComFrame.util.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait carrinhoPage;
    protected static WebDriverWait shortWait;


    /**
     * Inicializa o {@code WebDriver} e o {@code WebDriverWait}
     */

    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    /**
     * fecha o driver web
     */
    protected static void closeWeb() {
        webDriver.quit();
    }

}
