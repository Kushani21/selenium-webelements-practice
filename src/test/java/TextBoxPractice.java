import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxPractice{
    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01vpe0nwpnrphslbkw1k7e1q5n1269925.node0");

    }

    @Test
    public void textBoxPractice(){

        //01 Type Name
        WebElement name=driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Kushani Dhanushika");

        //02 Append Country to this City
        WebElement appendText=driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("India");

        //03 Verify if text box is disabled
        WebElement checkDisable=driver.findElement(By.id("j_idt88:j_idt93"));
        boolean isDisable=checkDisable.isEnabled();
        System.out.println("Verify if text box is disabled"+isDisable);

        //04 Clear the typed text
        WebElement clearText=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
        clearText.clear();

        //05 Retrieve the typed text
        WebElement getText=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
        System.out.println(getText.getText());

        //06 Type email and Tab. Confirm control moved to next element
        WebElement emailType=driver.findElement(By.id("j_idt88:j_idt99"));
        emailType.sendKeys("dhanushikakwk@gmail.com"+ Keys.TAB);


    }

}
