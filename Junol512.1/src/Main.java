import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String str = sc.next();
        sc.close();
        
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f\n", b);
        System.out.printf("%s\n", str);
    }
}