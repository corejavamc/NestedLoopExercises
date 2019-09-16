/*
 * Write a program to mimic a stop watch where a user supplies a start time in minutes.
 */


import java.util.Scanner;

public class StopWatch {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        int limit;

        System.out.println("Enter a time in minutes.");
        limit = keybd.nextInt();

        for (int min = limit-1; min >= 0; min--) {
            for (int sec = 59; sec >= 0; sec--) {
                //System.out.println(min + ":" + sec);
                System.out.printf("%2d:%2d\n", min, sec);
            }
        }
        System.out.println("Time over!");



    }
}
