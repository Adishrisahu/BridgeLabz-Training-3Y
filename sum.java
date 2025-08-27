import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, num;

        System.out.print("Enter number (0 to stop): ");
        num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextDouble();
        }

        System.out.println("The total sum is " + total);
    }
}
