package newproject.newproject;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TeslaSteps {
    WebDriver driver;
    WebElement dropdown;

    @Given("I open the Tesla homepage")
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.tesla.com/");
    }

    @When("I locate the dropdown")
    public void locateDropdown() {
        dropdown = driver.findElement(By.id("some-dropdown-id")); // Update with real ID
    }

    @Then("I should see all dropdown options")
    public void printDropdownOptions() {
        Select select = new Select(dropdown);
        for (WebElement option : select.getOptions()) {
            System.out.println(option.getText());
        }
        driver.quit();
    }
}
