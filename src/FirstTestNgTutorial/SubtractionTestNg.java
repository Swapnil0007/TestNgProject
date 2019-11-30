package FirstTestNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class  SubtractionTestNg

{
@Test	
public void test() {
	int num1=10;
	int result ;
	result= Subtraction.subtraction(15,5);
     Assert.assertEquals(num1,result);

}

@Test	
public void test1() {
	int num1=10;
	int result ;
	result= Subtraction.subtraction(2,5);
     Assert.assertEquals(num1,result);

}
}

