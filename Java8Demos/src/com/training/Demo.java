package com.training;

import java.util.function.Consumer;
import java.util.function.Predicate;

interface Calculator{
	void calculator(int x,int y);
}
public class Demo {
	public static void main(String[] args) {
		Calculator calc1 = (int x,int y)->System.out.println(x*y);
		calc1.calculator(10, 20);
		
		Consumer<String> con =(s)->System.out.println(s.toUpperCase());
		con.accept("Hello");
	    Consumer<Integer> in = (t)->System.out.println("Sq "+t*t);
	    in.accept(6);
	    
	    Predicate<String> pred1 =(s)->s.length()>5;
	    pred1.test("Hello");
	    pred1 = (s)->s.toLowerCase().equals("welcome");
	    System.out.println(pred1.test("WELCOME"));
	}

}
