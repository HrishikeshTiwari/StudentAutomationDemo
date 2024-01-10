package ListnersDemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnersDemo.ListenerTest.class)
// @Listeners({ListnersDemo.ListenerTest.class, ListnersDemo.ListenerTest1.class,ListnersDemo.ListenerTest2.class}) this is for when we have multiple class to implement
// Listners at class Level. But in case of multiple Listners it is recommended to use testNG. xml file.
public class ListnersDemo1  {
	
	@Test
	public void Test1() {
		System.out.println("I am under test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("I am under test2");
	}
     @Test
	public void Test3() {
		System.out.println("I am under test2");
	}


}

// Here we have add Listners at class level which is not recommended beacause when we have multiple class then it will be problem. we can give class name seperating by 
// comma but it not recommended. in that place use testNG.xml file.
