/*PR-22_B: Write a test program that prompts the user to enter an integer and display its product. */

import java.util.Scanner;

public class PR22_B
{
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  int product=1;
  System.out.print("Enter five integers: ");
  int[] list = new int[5]; 
  for (int i = 0; i < list.length; i++) 
  {
   list[i] = input.nextInt();
   product *= list[i];
  }
  System.out.println("The Product of elements is " + product);
 }
}