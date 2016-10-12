package fcu.iecs.oop;
import java.util.Scanner;
public class Execrcise4 {
   
	public static void main(String[] args) {
		Scanner PrintNumberInWord=new Scanner(System.in);
		
		while(true){
			System.out.println("Enter a integer:");
			int integer=PrintNumberInWord.nextInt();
			if(integer==1)System.out.println("The input integer is ¡§ONE¡¨.");
			if(integer==2)System.out.println("The input integer is ¡§two¡¨.");
			if(integer==3)System.out.println("The input integer is ¡§three¡¨.");
			if(integer==4)System.out.println("The input integer is ¡§four¡¨.");
			if(integer==5)System.out.println("The input integer is ¡§five¡¨.");
			if(integer==6)System.out.println("The input integer is ¡§six¡¨.");
			if(integer==7)System.out.println("The input integer is ¡§seven¡¨.");
			if(integer==8)System.out.println("The input integer is ¡§eight¡¨.");
			if(integer==9)System.out.println("The input integer is ¡§nine¡¨.");
			if(integer>9||integer<1)System.out.println("The input integer is ¡§OTHER¡¨.");
			
			}
	}
}
