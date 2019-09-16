/*
 * Use nested for loops to produce the following output:

1
22
333
4444
55555
666666
7777777
88888888
999999999
 */

public class Triangle {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);

            System.out.println();
        }
    }
}
