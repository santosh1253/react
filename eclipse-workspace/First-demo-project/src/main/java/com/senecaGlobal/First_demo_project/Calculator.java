package com.senecaGlobal.First_demo_project;
public class Calculator implements MathService{

	@Override
	public long doublelong(long a) {
		
		return a*2;
	}

	@Override
	public long triplelong(long a) {
		// TODO Auto-generated method stub
		return a*3;
	}
     
}
