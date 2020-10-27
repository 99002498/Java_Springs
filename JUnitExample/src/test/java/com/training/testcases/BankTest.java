package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.examples.Bank;
import com.training.examples.ExceedingException;
import com.training.examples.NegValueException;

class BankTest {
	Bank bank;

	double balance;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Init");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Init");
	}

	@BeforeEach
	void setUp() throws Exception {
	       bank =new Bank(8000);
		System.out.println("Init");
	}

	@AfterEach
	void tearDown() throws Exception {
		bank=null;
		System.out.println("Destroy");
	}

	@Test
	void testWithdraw() throws ExceedingException {
		balance =bank.withdraw(2000);
		assertEquals(6000,balance,"should be correct");
		//assertThrows(ExceedingException.class,()->bank.withdraw(4000));
	}
	void testWithdrawExceeding() {
		//balance =bank.withdraw(2000);
		//assertEquals(6000,balance,"should be correct");
		assertThrows(ExceedingException.class,()->bank.withdraw(4000));
	}
	@Test
	void testWithdrawNeg() {
		assertThrows(NegValueException.class,()->bank.withdraw(-900));
		
	}

	@Test
	void testDeposite() throws ExceedingException {
		balance=bank.deposite(1000);
		assertEquals(9000,balance,"should be correct");
		//fail("Not yet implemented");
	}
	@Test
	void testDepositeExceed() {
		//balance=bank.deposite(1000);
		//assertEquals(9000,balance,"should be correct");
		//fail("Not yet implemented");
		assertThrows(ExceedingException.class,()->bank.deposite(50000));
	}

}
