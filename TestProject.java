package test;

import java.util.*;

public class TestProject {
	
	String input;
	int charSeperation;
	
	String output = "";
	
	TestProject() {
		System.out.println("Enter 2 setences: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine(); // inputs the persons sentences
		
		for(int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '!' || input.charAt(i) == '.' || input.charAt(i) == '?') { //checks for punctuation
				charSeperation = i;
				
				for(int j = 0; j < input.length() - charSeperation - 2; j++) { // puts the alternated letter output into the variable output. -2 was used to make sure the string wasn't out of bounds if variable j was too high
					int difference = input.length() - charSeperation;
					if(charSeperation < difference && j >= charSeperation) {
						output = output + String.valueOf(input.charAt(j+charSeperation+2));
						continue;
					}
					if(charSeperation > difference && j+charSeperation+2 >= input.length()) {
						output = output + String.valueOf(input.charAt(j));
						continue;
					}
					output = output + String.valueOf(input.charAt(j));
					output = output + String.valueOf(input.charAt(j+charSeperation+2)); // +2 was used to get the placement of the output correct
				}
				break;
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		new TestProject();
	}
}
