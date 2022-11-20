import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int i;
        int s;
        int t;
        System.out.println("Enter the number of rows you'd like to create your diamond shape: ");
        Scanner scanner = new Scanner(System.in);
        t= scanner.nextInt();
        for (i=0; i<=t;i++)
        {
            for(s=1; s<=t-i;s++)
                System.out.print(" ");
            for (s=1;s<=2*i-1;s++)
                System.out.print("*");
            System.out.println("");
        }
        for (i=t-1;i>=1;i--)
        {
            for (s=1;s<=t-i;s++)
                System.out.print(" ");
            for (s=1;s<=2*i-1;s++)
                System.out.print("*");
            System.out.println("");
        }

        }
    }
