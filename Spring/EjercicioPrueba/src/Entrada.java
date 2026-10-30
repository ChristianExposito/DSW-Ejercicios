import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu numero: ");
        int numero = sc.nextInt();
        sc.nextLine();

        if (numero <= 10) {
            System.out.print("Introduce tu nombre: ");
            String nombre = sc.nextLine();
            for (int i = 0; i < numero; i++) {
                System.out.println("hola " + nombre);
            }
            int longitud = nombre.length();
            System.out.println(nombre + " contiene este numero de letras: " + longitud);

        } else {
            System.out.println("no puedes poner ese numero");
        }
    }
}

