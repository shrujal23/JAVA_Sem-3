/* PR-12: Write a program that creates a Random object with seed 1000 and displays the first  100  random integers between 1 and 49 using the NextInt
 (49) method. */

import java.util.Random;
public class PR12 
{
 public static void main(String[] args) 
 {
         Random rand = new Random(1000);
         for (int i = 0; i < 100; i++) 
        {
            System.out.format("%3d",rand.nextInt(49));
            if((i+1)%20==0)
            {
                System.out.println();
            }
         }
    }
}