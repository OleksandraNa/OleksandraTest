package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class CalculatorPage {

    public WebDriver driver;
    public WebElement element;
    public String driverPath = "chromedriver.exe";
    private String urlGoogle = "http://google.com";

    By inputField = By.xpath("//*[@id='cwtltblr']");
    By additionLocator = By.xpath("//*[@id='cwbt46']/div/span");
    By subtractionLocator = By.xpath("//*[@id='cwbt36']/div/span");
    By multiplicationLocator = By.xpath("//*[@id='cwbt26']/div/span");
    By divisionLocator = By.xpath("//*[@id='cwbt16']/div/span");
    By CELocator = By.xpath("//*[@id='cwclrbtnAC']");
    By equalLocator = By.xpath("//*[@id='cwbt45']/div/span");
    By idEl =By.id("lst-ib");


    public void open() throws Exception {


        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.navigate().to(urlGoogle);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element = driver.findElement(idEl);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element.sendKeys("calculator");
        element.submit();
    }

    public void addition() {
        System.out.println("addition");
        driver.findElement(additionLocator).click();
    }

    public void subtraction() {
        driver.findElement(subtractionLocator).click();
    }

    public void multiplication() {
        driver.findElement(multiplicationLocator).click();
    }

    public void division() {
        driver.findElement(divisionLocator).click();
    }

    public CalculatorPage typeInput(String input) {
        element = driver.findElement(inputField);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element.sendKeys(input);
        return this;
    }

    public String output() {
        String output = driver.findElement(inputField).getText();
        return output;
    }

    public void resset() {
        element=driver.findElement(CELocator);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        element.click();
    }



    public void equal() {
        driver.findElement(equalLocator).click();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
