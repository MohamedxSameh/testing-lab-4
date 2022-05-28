import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestOne
{
    // TEST SETUP
    //
    @Test
    public void test1()
    {
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.quit();
    }


    // TEST THAT ALL ELEMENTS INNER TEXT ARE VIEWED CORRECTLY
    //
    @Test
    public void test2()
    {
        System.setProperty("webdriver.chrome.driver","resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        assertEquals("FORMY",driver.findElement(By.cssSelector("#logo")).getText());
        assertEquals("Form",driver.findElement(By.cssSelector("#navbarNavDropdown > ul > li:nth-child(1) > a")).getText());
        assertEquals("Components",driver.findElement(By.cssSelector("#navbarDropdownMenuLink")).getText());
        assertEquals("Complete Web Form",driver.findElement(By.cssSelector("body > div > h1")).getText());
        assertEquals("First name",driver.findElement(By.cssSelector("#first-name")).getText());
        assertEquals("Last name",driver.findElement(By.cssSelector("#last-name")).getText());
        assertEquals("Job title",driver.findElement(By.cssSelector("job-title")).getText());
        assertEquals("Highest level of education",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(1) > strong > label")).getText());
        assertEquals("High School",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(2)")).getText());
        assertEquals("College",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(3)")).getText());
        assertEquals("Grad School",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(7) > div:nth-child(4)")).getText());
        assertEquals("Sex",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(1) > strong > label")).getText());
        assertEquals("Male",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(2)")).getText());
        assertEquals("Female",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(3)")).getText());
        assertEquals("Prefer not to say",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(9) > div:nth-child(4)")).getText());
        assertEquals("Years of experience:",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(11) > strong > label")).getText());
        assertEquals("Date",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(13) > strong > label")).getText());
        assertEquals("Submit",driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).getText());
        driver.quit();
    }
    
    // TEST THAT ALL ELEMENTS THAT CONTAINS EVENTS
    //
    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Mohamed test1");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Sameh test1");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("Student test1");
        driver.findElement(By.cssSelector("#radio-button-1")).click();
        driver.findElement(By.cssSelector("#checkbox-1")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).click();
        driver.quit();
    }
}
