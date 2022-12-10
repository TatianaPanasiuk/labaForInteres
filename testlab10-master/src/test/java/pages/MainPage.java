package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://wolkonsky.com/";
    private static final String urll = "https://wolkonsky.com/cart/";

    private final WebDriver driver;

    @FindBy(xpath = "//a[@href='/catalog/']")
    private WebElement menu;
    @FindBy(xpath = "//a[@class='btn js-city-changer-button']")
    private WebElement cityButtonChoose;

    @FindBy(xpath = "//a[@href='?switch_city=1']")
    private WebElement city;






    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void chooseCity(){
        Actions actions = new Actions(driver);
        actions.click(city);
        actions.click(cityButtonChoose);
        actions.perform();
    }
    public Menu clickToMenu(){
        Actions actions = new Actions(driver);
        actions.click(menu);
        actions.perform();
        return new Menu(driver);
    }

}

//
//    public void clickToPirog(){
//        Actions actions = new Actions(driver);
//        actions.click(pirog);
//        actions.perform();
//    }
//
//    public void scrollToDovil(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(dovil).click();
//        actions.perform();
//    }
//
//    public void clickToBasket(){
//        Actions actions = new Actions(driver);
//        actions.click(toBasket);
//        actions.perform();
//    }
//
//    public void clickTofinalBasket(){
//        Actions actions = new Actions(driver);
//        driver.get(urll);
//    }

//    @FindBy(xpath = "//a[@href='/moscow/catalog/pekarnya/pirogi/']")
//    private WebElement pirog;
//
//    @FindBy(xpath = "//a[@href='/moscow/catalog/product/pirog-dovil/']")
//    private WebElement dovil;
//
//    @FindBy(xpath = "//a[@class ='btn btn--red js-cart-add-btn']")
//    private WebElement toBasket;
//
//
//    @FindBy(xpath = "//div[@class ='header-cart js-cart-header ']")
//    private WebElement toBasketfinal;



