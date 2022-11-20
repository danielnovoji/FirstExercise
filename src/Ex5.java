import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        isFibByUserInput();
    }

   public static void isFibByUserInput () {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a Fib Number:");
       int userInput=scanner.nextInt();
       boolean isFib = isFib(userInput);
       System.out.println("Is the number Fib? " + isFib);
   }
    public static boolean isFib(int userInput) {
        int firstNumber = 0;
        int secondNumber = 1;
        boolean isFib = true;
        while (isFib && userInput != 0) {
            int sum = firstNumber + secondNumber;
            if (sum == userInput) {
                break;
            } else if (sum > userInput) {
                isFib = false;
            } else {
                firstNumber = secondNumber;
                secondNumber = sum;
            }
        }
        return isFib;
    }
}
