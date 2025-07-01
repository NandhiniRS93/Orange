package util;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropdownTest {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        WebDriver driver = new ChromeDriver();
	        try {
	            driver.get("https://www.tesla.com/");

	            // Example: Adjust the locator below to match an actual dropdown on the site
	            WebElement dropdown = driver.findElement(By.id("some-dropdown-id"));

	            Select select = new Select(dropdown);
	            System.out.println("Dropdown options:");
	            for (WebElement option : select.getOptions()) {
	                System.out.println(option.getText());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}



