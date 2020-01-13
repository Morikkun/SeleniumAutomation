/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edureka;
import java.util.concurrent.TimeUnit;
import static javax.management.Query.div;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author diego
 */
public class Edureka {
    WebDriver driver;
    JavascriptExecutor jse;
    public void invokeBrowser(){
        try {
            
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\OneDrive\\Área de Trabalho\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            
            driver.get("https://www.amazon.com.br");
            searchGame();
            
        }
        catch (Exception e)
                            {e.printStackTrace();
        }
    }
         public void searchGame(){
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Ar condicionado");
         driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
         jse = (JavascriptExecutor) driver;
         jse.executeScript("scroll(0,1000)");
         driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[14]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
                 }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Edureka teste1 = new Edureka();
        teste1.invokeBrowser();
        
        
    
    
}
}
