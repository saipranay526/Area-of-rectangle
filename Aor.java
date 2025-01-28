import java.util.Scanner;
public class Aor {
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the rectangle ");
        int length = scanner.nextInt();
        System.out.println("enter the breadth of the rectange");
        int breadth = scanner.nextInt();
        float area = length *breadth;
        System.out.println("the area of the rectangle is "+area);
        scanner.close();
    }
}
