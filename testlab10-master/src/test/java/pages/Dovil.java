package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dovil {

    @FindBy(xpath = "//a[@class ='btn btn--red js-cart-add-btn']")
    private WebElement toBasket;


    @FindBy(xpath = "//div[@class ='header-cart js-cart-header ']")
    private WebElement toBasketfinal;

    private static final String urll = "https://wolkonsky.com/cart/";

    private final WebDriver driver;
    public Dovil(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickToBasket(){
        Actions actions = new Actions(driver);
        actions.click(toBasket);
        actions.perform();
    }

    public void clickTofinalBasket(){
        Actions actions = new Actions(driver);
        driver.get(urll);
    }


}
