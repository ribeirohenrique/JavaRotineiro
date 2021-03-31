package selenium;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.*;

public class TesteLogin4 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginErrado4() throws InterruptedException {
    // Step # | name

    // 1 | open
    driver.get("https://outlook.live.com/owa/");
    Thread.sleep(500);

    // 2 | setWindowSize
    driver.manage().window().setSize(new Dimension(1366, 720));
    Thread.sleep(250);

    // 3 | click
    driver.findElement(By.linkText("Entrar")).click();
    Thread.sleep(1000);

    // 4 | type
    driver.findElement(By.id("i0116")).sendKeys("testandotestestestados@outlook.com");
    Thread.sleep(1000);

    // 5 | click
    driver.findElement(By.id("idSIButton9")).click();
    Thread.sleep(1000);

    // 6 | click
    driver.findElement(By.id("i0118")).click();
    Thread.sleep(500);

    // 7 | type
    driver.findElement(By.id("i0118")).sendKeys("123456Testes");
    Thread.sleep(500);

    // 8 | click
    driver.findElement(By.id("idSIButton9")).click();
    Thread.sleep(500);

    // 9 | waitForElementPresent
    {
      WebDriverWait wait = new WebDriverWait(driver, 5000);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("O365_MainLink_NavMenu")));
    }
    // 10 | click
    driver.findElement(By.cssSelector(".\\_33rLSYbzxvhXjgYTwfjWQI > .ms-Button-flexContainer")).click();
    Thread.sleep(1000);

    // 11 | click
    driver.findElement(By.cssSelector(".ms-BasePicker-input")).click();
    Thread.sleep(500);

    // 12 | type | sendTAB
    driver.findElement(By.cssSelector(".ms-BasePicker-input")).sendKeys("testandotestestestados@outlook.com");
    driver.findElement(By.cssSelector(".ms-BasePicker-input")).sendKeys(Keys.TAB);
    Thread.sleep(2500);

    // 14 | type
    driver.findElement(By.xpath("//input[@placeholder='Adicionar um assunto']")).sendKeys("Ela partiu, e nunca mais voltou :(");
    driver.findElement(By.xpath("//input[@placeholder='Adicionar um assunto']")).sendKeys(Keys.TAB);
    Thread.sleep(1000);

    // 14 | type
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[2]/div[1]")).sendKeys("Nao voltou, n�o, uuuuuu");
    Thread.sleep(1000);

    // 15 | click
    driver.findElement(By.cssSelector(".ms-Button--primary")).click();
    Thread.sleep(500);

    // 16 | waitForElementPresent
    {
      WebDriverWait wait = new WebDriverWait(driver, 5000);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".\\_6tY-cxX-513mYdh6yJLFJ")));
    }
    // 17 | click
    driver.findElement(By.className("_14ggU2yZvNol5U91gfmYQA")).click();
    Thread.sleep(1000);

    // 18 | click
    driver.findElement(By.id("meControlSignoutLink")).click();
    Thread.sleep(1000);

    // 19 | webdriverChooseOkOnVisibleConfirmation
    //driver.switchTo().alert().accept();

    // 20 | waitForElementPresent
    {
      WebDriverWait wait = new WebDriverWait(driver, 5000);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sb_form_go")));
    }
  }
}
