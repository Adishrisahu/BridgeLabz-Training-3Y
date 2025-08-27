import java.util.Scanner;

public class Naturalfor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            System.out.println("Formula sum: " + formulaSum);
            System.out.println("For loop sum: " + loopSum);
            System.out.println("Both are equal? " + (formulaSum == loopSum));
        } else {
            System.out.println("Not a natural number");
        }
    }
}
