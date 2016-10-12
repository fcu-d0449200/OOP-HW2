package fcu.iecs.oop;
import java.util.Scanner;
public class Execrcise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner check=new Scanner(System.in);
     System.out.println("Enter a integer:  ");
     int i=check.nextInt();
     if(i%2!=0)System.out.println("°ò¼Æ(Odd Number)");
     if(i%2==0)System.out.println("°¸¼Æ(Odd Number)");
}
}