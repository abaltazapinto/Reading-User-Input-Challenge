//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int i = 0;

        while (i < 5) {
            System.out.println(" Enter number " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid number");
                scanner.next(); // consumes the invalid input
            }
        }

        System.out.println("You've entered : ");
        // checking the numbers
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}