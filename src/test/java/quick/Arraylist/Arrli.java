package quick.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Arrli {
	
	@Test
	
	public void lisa() {
	
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//a=[1,5,7,6,9];
		
		Integer[] a = {6,3,7,4,2};
		
		
		int x=9;
		
		ArrayList<Integer> al = new ArrayList<Integer>( Arrays.asList(a));
		
		for(int i=0;i<al.size();i++) {
			
			//int temp ;
			//temp=x-al.get(i);
			
			if(al.get(i)+al.get(1)==x) {
				
				System.out.println("value is Temp"+al.get(i) + "and" + al.get(1));
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
}
		
	
		
		//al.addAll(al2);
		