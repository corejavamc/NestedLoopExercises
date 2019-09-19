/*
*   1. Write a loop to display the following:
*      1
*      12
*      123
*      1234
*      12345
*
*   2. Write a loop to display the following:
*      1
*      22
*      333
*      4444
*      55555
*
*   3. Write a program to display the following:
*      1
*      2 3
*      4 5 6
*      7 8 9 10
*
*   4. Write a program to display the following:
*      1
*      01
*      101
*      0101
*      10101
*/

public class Triangle {
    public static void main(String args[]) {

        /*
         * Exercise #1
         */
        System.out.println("***** Exercise 1 *****\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println();
        }
        /*
         * Exercise #2
         */
        System.out.println("\n***** Exercise 2 *****\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);

            System.out.println();
        }


        /*
         * Exercise #3
         */
        System.out.println("\n***** Exercise 3 *****\n");
        int index = 1;
        for (int i = 1; (i < 10) && (index < 10); i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(index + " ");
                index++;
            }

            System.out.println();
        }

        /*
         * Exercise #4
         */

        System.out.println("\n***** Exercise 4 *****\n");
        int counter = 1;
        for (int row = 1; row <= 5 ; row++) {

            for (int j = 1; j <= row; j++) {
                System.out.print(counter%2);
                counter++;
            }

            System.out.println();
        }

    }
}
