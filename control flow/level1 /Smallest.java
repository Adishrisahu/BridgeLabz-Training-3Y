import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean result = (n1 <= n2 && n1 <= n3);
        System.out.println("Is the first number the smallest? " + result);
    }
}
