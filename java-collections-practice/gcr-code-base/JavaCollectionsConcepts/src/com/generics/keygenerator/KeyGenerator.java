package com.generics.keygenerator;

import java.util.*;

public class KeyGenerator {
private static void CleanseAndInvert(String key) {
    
	//Check size
	if(key.length() < 6) {
		System.out.println("Invalid input!");
		return;
	}
	//Check special character and space
	boolean ansh = false;
	for(int i=0; i<key.length(); i++) {
		int ASCI = (int)(key.charAt(i));
		if((ASCI >= 97 && ASCI <=121) || (ASCI>=65 && ASCI<=92)) {
			ansh = true;
	}
		else {
			ansh = false;
			System.out.println("Invalid input!");
			break;
		}
		
	}

	//If everything is well
	if(ansh) {
	//Converted to lowerCase
	key = key.toLowerCase();
	String newStr = "";
	//Check for positive number and remove
	for(int i=0; i<key.length(); i++) {
		int asci = (int)(key.charAt(i));
		if(asci % 2 != 0) {
		 newStr += key.charAt(i);
		}
	}
//	System.out.println("New :"+newStr);
	
	//Reverse the String
	String newStr1 = "";
	for(int i=newStr.length()-1; i>=0; i--) {
		newStr1 += newStr.charAt(i);
	}
//	System.out.println("New :"+newStr1);
	
	//Convert to upperCase at positive index
	String newStr2 = "";
	for(int i=0; i<newStr1.length(); i++) {
		
		if(i % 2 ==0) {
			newStr2 += newStr1.toUpperCase().charAt(i);
		}
		else {
			newStr2 += newStr1.charAt(i);
		}
	}
	System.out.println("Final Output :"+newStr2);
}
}

//Main
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string : ");
	String key = sc.nextLine();
	CleanseAndInvert(key);
}
}
