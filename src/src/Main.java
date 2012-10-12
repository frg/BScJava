package src;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Arithmetic math = new Arithmetic();
		//Number of required inputs
		int inAmount = 2;
		
		//Clones inputs to array
		String in[] = (String[])input(inAmount).clone();
		double inArr[] = new double[inAmount];
		
		//Convert String array to double
		for(int i = 0; i< inAmount; i++)
			inArr[i] = Double.parseDouble(in[i]);
		
		System.out.println("Addition: " + math.Add(inArr));
		System.out.println("Subtraction: " + math.Subtract(inArr));
		System.out.println("Multiplication: " + math.Multiply(inArr));
		System.out.println("Division: " + math.Divide(inArr));
		System.out.println("Average: " + math.Average(inArr));
	}
	
	public static String[] input(int requiredIns){
		Scanner in = new Scanner(System.in);
		String input[] = new String[requiredIns];
		
		for (int i = 0; i < requiredIns; i++){
			input[i] = in.next();
		}
		
		return input;
	}

}
