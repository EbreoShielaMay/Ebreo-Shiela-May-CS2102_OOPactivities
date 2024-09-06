import java.util.Scanner;

public class GettingGreater {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first character: ");
        char charVal_1 = input.next().charAt(0);

        System.out.print("Enter the second character: ");
        char charVal_2 = input.next().charAt(0);

        char maxVal = (char) Math.max(charVal_1,charVal_2);

        System.out.println("-----------------------------------------------");
        System.out.println("The character with greater value is: " + maxVal);
        System.out.println("-----------------------------------------------");
        System.out.println("Showing the ASCII Codes");

        System.out.println(charVal_1 + ":" + (int)charVal_1);
        System.out.println(charVal_2 + ":" + (int)charVal_2);

        input.close();
    }
}
