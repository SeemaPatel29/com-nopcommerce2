package browsertesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "FireFox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("FireFox")){
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name :");
        }
        ////open the Url into Browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        //printing Title
        System.out.println(driver.getTitle());
        //Find the email field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type the Email adress to email field element
        emailField.sendKeys("Admin1234@gmail.com");
        //find the password field element and type the password
        driver.findElement(By.name("Password")).sendKeys("admin1234");
        //close the Browser
        driver.close();



    }

}
