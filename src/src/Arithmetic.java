package src;

public class Arithmetic {
	
	public double Add(double addThese[]) {
		double add = 0;
		for(int i = 0; i < addThese.length; i++) {
			add += addThese[i];
		}
		
		return add;
	}
	
	public double Subtract(double subThese[]){
		double sub = subThese[0];
		for(int i = 1; i < subThese.length; i++) {
			sub -= subThese[i];
		}
		
		return sub;
	}
	
	public double Multiply(double multThese[]){
		double mult = multThese[0];
		for(int i = 1; i < multThese.length; i++) {
			mult *= multThese[i];
		}
		
		return mult;
	}
	
	public double Divide(double divThese[]){
		double div = divThese[0];
		for(int i = 1; i < divThese.length; i++) {
			div /= divThese[i];
		}
		
		return div;
	}

	public double Average(double avrgThese[]) {
		double avrg = 0;
		for(int i = 0; i < avrgThese.length-1; i++) {
			avrg += avrgThese[i];
		}
		
		return avrg/avrgThese.length;
	}
	
	public int MarkClassifier(int mark){
		int grade = -1;
		
		if (mark > 40)
			grade  = 4;
		if (mark > 60) 
			grade  = 3;
		if (mark > 70)
			grade  = 2;
		if (mark > 80) 
			grade  = 1;
			
		return grade;
	}
	
	public double TempConvertor1F2C(int scale, double temp ){
		//F = (9/5)C + 32
		double conversion = Double.MAX_VALUE;
		
		//Scale = 1 for Fahrenheit. Scale = 2 for Celsius
		switch (scale){
			case 1: conversion = temp/(9/5) -32;
					break;
			case 2: conversion = (9/5)*temp + 32;
					break;
			default: conversion = Double.MAX_VALUE;
		}
		
		return conversion;
	}
}
