package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
    @FindBy(xpath = "//a[@href='/moscow/catalog/pekarnya/pirogi/']")
    private WebElement pirog;
    @FindBy(xpath = "//a[@href='/moscow/catalog/product/pirog-dovil/']")
    private WebElement dovil;

    private final WebDriver driver;
    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickToPirog(){
        Actions actions = new Actions(driver);
        actions.click(pirog);
        actions.perform();
    }

    public Dovil scrollToDovil(){
        Actions actions = new Actions(driver);
        actions.moveToElement(dovil).click();
        actions.perform();
        return new Dovil(driver);
    }
}
