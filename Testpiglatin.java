package gamesnstuff;

import java.util.Scanner;

public class Testpiglatin {
	public static void main(String[] args) {
	for(int i = 0; i >= 0; i++){
	Scanner kb = new Scanner(System.in);
		System.out.println("Please input the next thing to be translated, or to quit type \"n\": ");
	String input = kb.nextLine();
	if(input.equals("n"))
		break;
	else{
		Piglatintrans alpha = new Piglatintrans(input);
		System.out.println("Translated that is: " + alpha.translate());
	}
	}
}}
