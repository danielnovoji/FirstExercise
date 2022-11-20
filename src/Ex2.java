import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number of the Arithmetic progression: ");
        int firstArithmeticNum = scanner.nextInt();
        System.out.println("Enter the range between the numbers: ");
        int range = scanner.nextInt();
        System.out.println("Enter the desired amount of number: ");
        int desiredAmount = scanner.nextInt();
        if (desiredAmount > 0) {
            System.out.println(firstArithmeticNum);
            int row = firstArithmeticNum;

            for (int i = 0; i <= desiredAmount; i++) {
                row = range + row;
                System.out.println(row);

            }
        }


    }
}

