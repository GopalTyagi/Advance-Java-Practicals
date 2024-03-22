package com.rays.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class Shape {

	/*
	 * public static int multi() { int a = 5; int b = 0; int c = a / b;
	 * System.out.println("Multi"); return c; }
	 */

	public void test() {
		int a = 5;
		int b = 0;
		int c = a / b;
		System.out.println(c);
		System.out.println("test");
	}

	@After
	public void test1() {
		System.out.println("test1");
	}

	@Ignore
	public void test2() {
		System.out.println("test2");
	}

	@Before
	public void test3() {
		System.out.println("test3");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Running Before class");
	}

	@Before
	public void setUpBefore() throws Exception {
		System.out.println("running before");
	}

	@AfterClass
	public static void setUpAfterClass() throws Exception {
		System.out.println("Running After class");
	}

	@AfterClass
	public static void setUpAfterClas() throws Exception {
		System.out.println("Running After clas");
	}

	@After
	public void setUpAfter() throws Exception {
		System.out.println("runnning After");
	}
}