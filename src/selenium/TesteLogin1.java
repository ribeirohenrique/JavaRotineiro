package selenium;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;


public class TesteLogin1 {
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
  public void loginErrado1() throws InterruptedException {
    // Step # | name | target | value

    // 1 | open | https://outlook.live.com/owa/ |
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
    driver.findElement(By.id("i0118")).sendKeys("123");
    Thread.sleep(500);

    // 8 | click
    driver.findElement(By.id("idSIButton9")).click();
    Thread.sleep(500);

    // 9 | assertElementPresent
    {
      List<WebElement> elements = driver.findElements(By.id("passwordError"));
      assert(elements.size() > 0);
    }
  }
}
