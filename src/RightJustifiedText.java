import java.util.Scanner;

public class RightJustifiedText {
    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        String inText, result;
        int textlength, maxlength=60;

        do {
            result = "";
            System.out.println("Enter your text string. Type q to quit:");
            inText = keybd.nextLine();

            if (inText.equalsIgnoreCase("q"))
                break;

            textlength = inText.length();
            for (int i = 0; i < maxlength - textlength; i++)
                result = result + " ";

            System.out.println(result + inText);
            System.out.println();
        } while (true);
    }
}
