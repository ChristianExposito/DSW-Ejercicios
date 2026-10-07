import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce la nota");
        int nota = sc.nextInt();
        if(nota<5) {
            System.out.print("suspenso");
        }else if(nota==5){
            System.out.print("suficiente");
        }else if (nota <7){
            System.out.print("bien");
        }else if (nota<9){
            System.out.print("notable");
        } else{
            System.out.print("sobresaliente");
        }
    }
}
