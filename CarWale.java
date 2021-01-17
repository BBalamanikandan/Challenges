package seleniumpractise;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://www.carwale.com/");
		
		wd.findElement(By.xpath("//div[text()='USED CARS']")).click();
		wd.findElement(By.xpath("//div[text()='Find Used Cars']")).click();
		wd.findElement(By.id("placesQuery")).sendKeys("Chennai");
		WebDriverWait wt=new WebDriverWait(wd,Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@cityname,'chennai')]")));
		Thread.sleep(5000);
		wd.findElement(By.xpath("//a[contains(@cityname,'chennai')]")).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("upDownArrow")));
		
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("arguments[0].click()", wd.findElement(By.id("upDownArrow")));
		jse.executeScript("arguments[0].click()", wd.findElement(By.xpath("//*[@id='minPriceList']/li[6]")));
		jse.executeScript("arguments[0].click()", wd.findElement(By.xpath("//*[@id='maxPriceList']/li[1]")));
		jse.executeScript("arguments[0].click()", wd.findElement(By.xpath("//li[@name='CarsWithPhotos']")));
		jse.executeScript("arguments[0].click()", wd.findElement(By.xpath("//span[text()=' Hyundai ']/..")));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Creta']/..")));
		jse.executeScript("arguments[0].click()", wd.findElement(By.xpath("//span[text()='Creta']/..")));
		
		Select st=new Select(wd.findElement(By.xpath("//select[@id='sort']")));
		st.selectByVisibleText("KM: Low to High");
		Thread.sleep(10000);
		List<WebElement> kms = wd.findElements(By.xpath("//table[@class='card-detail__vehicle-data']//td[contains(@data-bind,'km')]/span"));
		System.out.println(kms.size());
		System.out.println(kms.get(0).getText());
		boolean flg=false;
		for(int i=1;i<kms.size();i++) {
			System.out.println(kms.get(i).getText());
			if(kms.get(i).getText().compareTo(kms.get(i-1).getText())>0 || kms.get(i).getText().compareTo(kms.get(i-1).getText())==0) {
				flg=true;
			}else {
				flg=false;
				break;
			}
		}
		if(flg)
			System.out.println("KMs sort validation passed.");
		else
			System.out.println("KMs sort validation failed!!!");
		
		for(int x=1;x<=4;x++) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='img-placer image-container__item']//span[@class='shortlist-icon--inactive shortlist'])["+x+"]")));
			jse.executeScript("arguments[0].click()",wd.findElement(By.xpath("(//div[@class='img-placer image-container__item']//span[@class='shortlist-icon--inactive shortlist'])["+x+"]")));
		}
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-action='ShortList&CompareWindow_Click']")));
		wd.findElement(By.xpath("//li[@data-action='ShortList&CompareWindow_Click']")).click();
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='shortlistCardetails']//p[2]")));
		List<WebElement> price = wd.findElements(By.xpath("//div[@class='shortlistCardetails']//p[2]"));
		
		for(int p=1;p<price.size();p++) {
			WebElement oldEle=price.get(p-1);
			WebElement newEle=price.get(p);
			if(Double.parseDouble(newEle.getText().split(" ")[1])>Double.parseDouble(oldEle.getText().split(" ")[1])) {
				Actions act=new Actions(wd);
				act.dragAndDrop(newEle,oldEle).build().perform();
				price.set(p,oldEle);
				price.set(p-1, newEle);
				price.parallelStream();
			}			
		}	
		Thread.sleep(5000);		
		wd.close();

	}

}
