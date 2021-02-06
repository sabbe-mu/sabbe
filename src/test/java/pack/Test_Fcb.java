package pack;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Fcb extends Base {


@Test(dataProvider = "getdata")
public void Test1(String username, String password) {
// TODO Auto-generated method stub

driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
}


@DataProvider
public Object[][] getdata() {
Object[][] data = new Object[3][2];
// Combinaison 1
data[0][0] = "login1";
data[0][1] = "mdp1";
// Combinaison 2
data[1][0] = "login2";
data[1][1] = "mdp2";
// Combinaison 3
data[2][0] = "login3";
data[2][1] = "mdp3";
return data;

	}

}
