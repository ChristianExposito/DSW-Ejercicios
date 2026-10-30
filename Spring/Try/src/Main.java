import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = 0;
    int b = 0;
    try{
    System.out.println("introduce un numero ");
    a = sc.nextInt();
    System.out.println("introduce otro numero ");
    b = sc.nextInt();
    System.out.println(a/b);
    }
}