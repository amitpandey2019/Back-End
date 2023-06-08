import java.util.Scanner;

public class qudratc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("Real and Distinct");
            int root1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            int root2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.println(root1 + " " + root2);
        } else if (discriminant == 0) {
            System.out.println("Real and Same");
            int root = (int) (-b / (2 * a));
            System.out.println(root);
        } else {
            System.out.println("Imaginary");
        }
    }
}
