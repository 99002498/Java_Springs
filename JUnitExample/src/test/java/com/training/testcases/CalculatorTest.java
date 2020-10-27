package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.examples.Calculator;
import com.training.examples.ExceedingException;

class CalculatorTest {

	Calculator calculator;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all Testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all Testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
	 calculator=new Calculator();
		System.out.println("Before each Testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println("After each Testcases");
	}

	

	@Test
	void testSum() {
		int actual = calculator.sum(10, 20);
		assertEquals(30,actual);
		//fail("Not yet implemented");
	}
	@Test
	void testSub() {
		int actual = calculator.sub(20, 10);
		assertEquals(10,actual);
		//fail("Not yet implemented");
	}
	@Test
	void testmul() {
		int actual = calculator.mul(10, 20);
		assertEquals(200,actual);
		//fail("Not yet implemented");
	}
	@Test
	void testdiv() {
		int actual = calculator.div(20, 10);
		assertEquals(2,actual);
		//fail("Not yet implemented");
	}
	double actual1 ;
	@Test
	void testavg() {
		actual1 = calculator.avg(20, 10, 30);
		//assertEquals(2,actual);
		//fail("Not yet implemented");
		assertThrows(ExceedingException.class,()->calculator.avg(100,100,100));
	}
	



}
