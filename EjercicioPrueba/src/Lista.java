import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {
        List<String> productos = new ArrayList<>();
        Scanner articulos = new Scanner(System.in);
        System.out.print("dime el producto");
        while (true) {
            System.out.print("> ");
            String entrada = articulos.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            productos.add(entrada);
        }
        System.out.println("Tu lista final es: " + productos);
    }
}