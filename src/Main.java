import com.sun.javafx.sg.prism.NGExternalNode;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //Part A
        // Task 1 for loop, counts 0-30 increments of 1

        for (int c = 0; c <= 30; c++) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        //Task 2 for loop, counts 30-0 increments of 1
        for (int c = 30; c >= 0; c--) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        //Task 3 for loop, counts 0-18 increments of 3
        for (int c = 0; c <= 18; c += 3) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        //Task 4 for loop, counts 10-0 increments of 2
        for (int c = 10; c >= 0; c -= 2) {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        System.out.println();
        // Part B
        // Task 5 nested loop, pyramid asterisks 5 rows, 1-5
        for (int row = 1; row <= 5; row++) {
            System.out.print("* ");
            for (int col = 1; col < row; col++) {
                System.out.printf("* ");
            }
            System.out.println("\n");
        }
        System.out.println();
        //Task 6 nested loop, pyramid asterisks 5 rows, 5-1
        for (int row = 5; row >= 1; row--) {
            System.out.print("* ");
            for (int col = 1; col < row; col++) {
                System.out.printf("* ");
            }
            System.out.println("\n");
        }
        System.out.println();
        //Task 7 nested loop, table asterisks 5 rows, 5 columns
        for (int row = 1; row <= 5; row++) {
            System.out.print("* ");
            for (int col = 1; col < 5; col++) {
                System.out.printf("* ", row * col);
            }
            System.out.println("\n");
        }
        //Part C
        //Task 8 Die Roller table 5 columns, triple
        //while loop - indefinite loop, number of times unknown
        //Random generator to create die rolls, 1-6, 3 die, sum
        //Run until get triple all match
        //formatted printing (table) - printf
        //Table - Roll counter, Die1, Die 2, Die 3, Sum
        //do while - runs once, then ask want to do it again
        //Inside do while, have a while that generates random output

        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int roll = 0;
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;
        boolean done = false;
        String continueYN = "";

        System.out.println("Roll   Die1   Die2   Die3    Sum");
        System.out.println("_________________________________");
        System.out.println();

        do
        //while (die1 == die2 && die2 == die3)
        //&& die1 != die3
        {
            roll++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;
            System.out.printf("%4d %6d %6d %6d %6d\n", roll, die1, die2, die3, dieRoll);
            // for (int r = 0; r <= 20; r++)
            //     {
            while (die1 != die2 || die1 != die3)
            {
                roll++;
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieRoll = die1 + die2 + die3;
                System.out.printf("%4d %6d %6d %6d %6d\n", roll, die1, die2, die3, dieRoll);
            }
            System.out.println("___________________________________");
            System.out.print("Enter any key to continue playing, Q to quit: ");
            continueYN = in.nextLine();
            //if(continueYN.equalsIgnoreCase("Q"))
            //{
              //  done = true;
            //}
        }
        //while (!done);
        while(!continueYN.equalsIgnoreCase("Q"));

    }
}