package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Teste {

  public static void main(String[] args) throws InterruptedException {

    System.out.println("Execution started-- Opening Firefox browser.");
    System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Selenium\\Firefox\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://duckduckgo.com/");
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("Testando");
    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    Thread.sleep(3000);
    driver.quit();
    System.out.println("Execution ending -- Webdriver session is closed.");

  }
}
