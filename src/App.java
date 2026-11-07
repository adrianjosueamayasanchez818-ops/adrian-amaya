
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] peso = new int [cantidadCargas(scanner)];


    }

    public static int cantidadCargas(Scanner scanner){
        System.out.println("ingrese la cantidad de carga");
        int cantidad = scanner.nextInt();
        return cantidad;
    }

    public static void cargarPeso(int [] peso){
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
            System.out.println("ingrese el peso:" + (i+1));
            peso[i] = scanner.nextInt();     
         }
    }

    
}
