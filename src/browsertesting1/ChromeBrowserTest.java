package browsertesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the Url into Browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        //get the Title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get current URl
        driver.getCurrentUrl();
        //print current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        //get page source
        System.out.println("Page Source :" + driver.getPageSource());

        WebElement emailField = driver.findElement(By.id("Email"));
        //Find the email field and element and type  the email
        emailField.sendKeys("Admin1234@gmial.com");

        // Enter the Password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("admin1234");
        //Close the Browser
       driver.close();

    }



}
