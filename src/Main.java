import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        //Part A
        // Task 1 for loop, counts 0-30 increments of 1

        for (int c = 0; c <= 30; c++)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        //Task 2 for loop, counts 30-0 increments of 1
        for (int c = 30; c >= 0; c--)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        //Task 3 for loop, counts 0-18 increments of 3
        for (int c = 0; c <= 18; c += 3)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        //Task 4 for loop, counts 10-0 increments of 2
        for(int c = 10; c >= 0; c -= 2)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");
        System.out.println();
        // Part B
        // Task 5 nested loop, pyramid asterisks 5 rows, 1-5
        for(int row = 1 ; row <= 5; row++)
        {
            System.out.print("* ");
            for(int col = 1; col < row ; col++)
            {
                System.out.printf("* ");
            }
            System.out.println("\n");
        }
        System.out.println();
        //Task 6 nested loop, pyramid asterisks 5 rows, 5-1
        for(int row = 5 ; row >= 1; row--)
        {
            System.out.print("* ");
            for(int col = 1; col < row ; col++)
            {
                System.out.printf("* ");
            }
            System.out.println("\n");
        }
        System.out.println();
        //Task 7 nested loop, table asterisks 5 rows, 5 columns
        for(int row = 1 ; row <= 5; row++)
        {
            System.out.print("* ");
            for(int col = 1; col < 5; col++)
            {
                System.out.printf("* ",row * col);
            }
            System.out.println("\n");
        }
        //Part C
        //Task 8 Die Roller table 5 columns, triple
        {
            Random rnd = new Random();
            int roll, die1, die2, die3, dieRoll;
            System.out.println("Roll   Die1   Die2   Die3    Sum");
            System.out.println("________________________________");
            System.out.println();
            for(int r=0; r <= 20; r++)
            {
                roll = r + 1;
                die1 = rnd.nextInt( 6) + 1;
                die2 = rnd.nextInt( 6) + 1;
                die3 = rnd.nextInt(6) + 1;
                dieRoll = die1 + die2 + die3;
                System.out.printf("%4d %6d %6d %6d %6d\n", roll, die1, die2, die3, dieRoll);

            }
        }
    }
}