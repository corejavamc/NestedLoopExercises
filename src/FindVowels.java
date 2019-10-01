import java.util.Scanner;

public class FindVowels {

    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        String inText;
        int count;

        do{
            System.out.println("Enter your text string. Type q to quit:");
            inText = keybd.nextLine();

            if (inText.equalsIgnoreCase("q"))
                break;

            count = 0;

            for (int i = 0; i < inText.length(); i++) {
                switch (inText.charAt(i)) {
                    case 'A':
                    case 'a':
                    case 'E':
                    case 'e':
                    case 'I':
                    case 'i':
                    case 'O':
                    case 'o':
                    case 'U':
                    case 'u':
                        count++;
                        break;
                }
            }

            System.out.println("\'" + inText + "\' has " + count + " vowels.");
            System.out.println();

        } while (true);
    }
}
