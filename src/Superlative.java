import java.util.Scanner;

public class Superlative {
    public static void main(String[] args) {
        double a;
        double b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = sc.nextDouble(); //Nhập a;

        System.out.println("Enter b: ");
        b = sc.nextDouble(); // Nhập b;

        System.out.println("Enter c: ");
        c = sc.nextDouble();

        if (a != 0){
            double answer = (c-b)/a;
            System.out.println("Nghiệm của pt là: " + answer);
        }else {
            if (b == c){
                System.out.println("Phương trình có vô số nghiệm! ");
            }else {
                System.out.println("Phương trình vô nghiệm! ");
            }
        }
    }
}
