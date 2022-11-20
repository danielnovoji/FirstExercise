import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitCounter = 1;
        int sum= 0;
        System.out.println("Enter the starting number: ");
        int number =scanner.nextInt();
        int num2 = number;
        do { num2 = num2 / 10;
            digitCounter++; }
        while (num2 >= 10);
        for (int i=1; i<=digitCounter; i++) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("The sum of the numbers is:" + sum);

        }

    }

