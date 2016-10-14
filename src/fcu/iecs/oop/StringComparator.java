package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner StringComparator = new Scanner(System.in);
		
		do{
			System.out.println("Enter a string 1:");
			String string1=StringComparator.next();
			System.out.println("Enter a string 2: ");
			String string2=StringComparator.next();
			if(string1.compareToIgnoreCase(string2)==0){
    			System.out.println("The two strings are the same.");
    			break;
    		}
    		else{
    			System.out.println("The two strings are not the same.");
    		}
		}while(true);

		
	}

}
