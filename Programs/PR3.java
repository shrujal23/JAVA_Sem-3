/*PR-3:- Write a program that reads a number in meters, converts it to feet, and displays the result. */

import java.util.Scanner;
public class PR3
{
public static void main(String[] args) 
 {
 	Scanner input = new Scanner(System.in);
  	System.out.print("Enter Value in Meters :");
  	double met = input.nextDouble();
  	double feet = met * 3.28084;
  	System.out.print(met + " Meters = "+ feet + " Feets");
 }
}