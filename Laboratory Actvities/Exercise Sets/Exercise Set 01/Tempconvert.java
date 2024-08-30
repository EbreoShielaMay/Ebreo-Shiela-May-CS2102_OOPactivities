import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a celcius value: ");
        float value = scanner.nextFloat();

        float Fahrenheit = value *9/5 + 32;
        System.out.println(value + " Celcius is equal to " + Fahrenheit + " Fahrenheit");

        scanner.close();
    }
}
