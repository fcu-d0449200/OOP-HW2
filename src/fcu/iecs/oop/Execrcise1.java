package fcu.iecs.oop;
import java.util.Scanner;
public class Execrcise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int integer=keyboard.nextInt();
        
        System.out.println("Enter a float point number:");
        float point=keyboard.nextFloat();
        
        System.out.println("Enter a you name:");
        String name=keyboard.next();
        
        double i=integer*point;
        System.out.printf("Hi "+name+",the multiplication of "+integer+" and "+point+" is "+"%.2e",i);
	}

}
