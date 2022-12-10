package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Dovil;
import pages.MainPage;
import pages.Menu;

public class SearchAccessoriesTest {
    private WebDriver driver;
    MainPage mainPage;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void isNewPateCreated() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();
        Thread.sleep(5500);
        mainPage.chooseCity();

        Menu menu = mainPage.clickToMenu();
        menu.clickToPirog();
        Dovil dovil = menu.scrollToDovil();
        dovil.clickToBasket();
        dovil.clickTofinalBasket();


    }

}








//        Thread.sleep(5500);
//        mainPage.clickToMenu();
//        Thread.sleep(5500);
//        mainPage.clickToPirog();
//        Thread.sleep(5500);
//        mainPage.scrollToDovil();
//        Thread.sleep(5500);
//        mainPage.clickToBasket();
//        Thread.sleep(5500);
//        mainPage.clickTofinalBasket();
//        Thread.sleep(5500);
