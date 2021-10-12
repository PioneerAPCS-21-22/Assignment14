
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your three numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        
        // make sure each number is between 1 and 10.
        if(n1 < 0 || n1 > 10 || n1 < 0 || n1 > 10 || n1 < 0 || n1 > 10) {
            System.out.println("Invalid input.");
        }

        // make sure no numbers are the same.
        if(n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Invalid input.");
        }
        
        // otherwise, play the game
        Lottery lot = new Lottery(n1, n2, n3);
        lot.checkMatch();
    }
}
