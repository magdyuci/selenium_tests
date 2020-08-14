import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    public static void firstTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fm-dev-ora.dev.strands.com/fm-api/logout.action");
        driver.findElement(By.name("username")).sendKeys("userBFM5");
        driver.findElement(By.name("submit")).submit();
        Assert.assertEquals(2,2);
        driver.close();
    }
}
