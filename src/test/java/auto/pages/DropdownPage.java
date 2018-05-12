package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class DropdownPage {

    final static String HEADING = "Dropdown List";
    WebDriver driver = null;
    String xpathHeading = "//h3";

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public DropdownPage verifyDropdownPageHeader() {

        WebElement headerEle = driver.findElement(By.xpath(xpathHeading));
        String actualHeading = headerEle.getText();
        assertEquals(actualHeading, HEADING,
                "Actual heading '" + actualHeading + "' should be same as expected '" + HEADING + "'.");
        return this;

    }

}