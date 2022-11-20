import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        getNPrimeNumbersByUserInput();

    }
    public static void getNPrimeNumbersByUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of prime numbers you want to see:");
        int nUserInput=scanner.nextInt();
        getNPrimeNumbers(nUserInput);
    }
    public static boolean isPrimeNumber (int pNumber) {
        boolean isPrimeNumber = true;
        for (int i=pNumber-1; i>=2; i--) {
            if (pNumber%i==0){
                isPrimeNumber=false;
                break;
            }
        }
        return isPrimeNumber;
    }
    public static void getNPrimeNumbers(int n) {
        int number=2;
        while (n!=0){
            if (isPrimeNumber(number)){
                System.out.print(number+" , ");
                n--;
            }
            number++;
        }
    }
}
