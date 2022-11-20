import java.util.Scanner;

public class Ex1 {
    public static final int NO_SOLUTION = 1;
    public static final int ONE_SOLUTION = 2;
    public static final int SECOND_SOLUTION = 3;
    public static final int PLUS_OPERATOR = 4;
    public static final int MINUS_OPERATOR = 5;

    public static void main(String[] args) {
        getInputFromUser();
    }

    public static void getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter A number:");
        int a = scanner.nextInt();
        System.out.println("enter B number:");
        int b = scanner.nextInt();
        System.out.println("enter C number:");
        int c = scanner.nextInt();
        print(a, b, c);
    }

    public static double getRootNumber(int a, int b, int c) {
        return b * b - 4 * a * c;

    }

    public static int getTypeOfEquation(double underRoot) {
        int type = SECOND_SOLUTION;
        if (underRoot < 0) {
            type = NO_SOLUTION;
        } else if (underRoot == 0) {
            type = ONE_SOLUTION;
        }
        return type;
    }

    public static double result(int operator, double underRoot, int a, int b) {
        double result;
        double root = Math.sqrt(underRoot);
        if (operator == PLUS_OPERATOR) {
            result = (-b + root);
        } else {
            result = (-b - root);
        }
        return result / (2 * a);
    }

    public static void print(int a, int b, int c) {
        double underRoot = getRootNumber(a, b, c);
        int type = getTypeOfEquation(underRoot);
        if (type == NO_SOLUTION) {
            System.out.println("No Solution.");
        } else {
            double x1 = result(PLUS_OPERATOR, underRoot, a, b);
            if (type == ONE_SOLUTION) {
                System.out.println("There is one solution: \nx = " + x1);
            } else {
                double x2 = result(MINUS_OPERATOR, underRoot, a, b);
                System.out.println("There are two solutions: \nx1 =" + x1 + " \nx2 = " + x2);
            }
        }
    }


}

