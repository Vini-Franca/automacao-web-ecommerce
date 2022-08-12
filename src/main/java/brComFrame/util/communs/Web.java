package brComFrame.util.communs;

import brComFrame.util.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements WebApplication {

    CHROME {
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            return new ChromeDriver();
        }


    },

    CHROME_WINDOWS {
        public WebDriver getDriver() {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            return new ChromeDriver();
        }

    }

}
