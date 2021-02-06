package pack;


import org.testng.annotations.Test;

public class Test_titre extends Base {
@Test(dataProvider = "getdata")
public void Test1(String username, String password) {

System.out.println("the title is " + driver.getTitle());
System.out.println("the URL is " + driver.getCurrentUrl());

	}

}
