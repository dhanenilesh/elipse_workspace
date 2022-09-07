package asa;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;


public class awq {
	@BeforeClass
	public static void method10() {
		System.out.println("BeforeClass");
	}
	@Before
	public void method() {
		System.out.println("Before");
	}
	@Test
	public void test() {
	
		System.out.println("1st Case");
	}
	@Test
	public void test2() {
	
		System.out.println("2st Case");
	}
	
	@After
	public void method1() {
		System.out.println("After");
		System.out.println();

}
	
	@AfterClass
	public static void method11() {
		System.out.println("AfterClass");}
}