package com.training.examples;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
		
		
	}
	public int sum(int x,int y) {
        return x+y;
    }
	public int sub(int x,int y) {
        return x-y;
    }
	public int mul(int x,int y) {
        return x*y;
    }
	public int div(int x,int y) {
        return x/y;
    }
	public double avg(int x,int y,int z) throws ExceedingException {
		if(x>100||y>100||z >100) {
			throw new ExceedingException("value greater than 100 ");
		}
		if(x<0||y<0||z <0) {
			throw new ExceedingException("value greater than 100 ");
		}
		return (x+y+z)/3;
	}

}
