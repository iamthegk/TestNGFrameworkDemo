package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNgDemo {
	@Parameters({"URL"}) // this is coming from xml -testng.xml : so we can set common values,url,apis from a cetralised way
	@Test
	public void demo(String fromXml) {
		System.out.println("hello");
		System.out.println(fromXml);
		
	}
	
	@Test
	public void demo1() {
		System.out.println("world");
	}

}
