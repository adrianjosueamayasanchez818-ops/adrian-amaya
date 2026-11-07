
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] peso = new int [cantidadCargas(scanner)];
        cargarPeso(peso, scanner);

        System.out.println("pesos entre 5 y 80: " + pesoEntre5y80(peso));
        System.out.println("pesos mayor 80: " + pesoMayor80(peso));
        System.out.println("pesos total: " + pesoTotal(peso));
        System.out.println("promediode carga: " + promedioCarga(peso));
        System.out.println("peso mayor: " + pesoMayor(peso));
        System.out.println("pesos mayores al promedio: " + pesoMayorPromedio(peso));

    }

    public static int cantidadCargas(Scanner scanner){
        System.out.println("ingrese la cantidad de carga");
        int cantidad = scanner.nextInt();
        return cantidad;
    }

    public static void cargarPeso(int [] peso,Scanner scanner){
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
            System.out.println("ingrese el peso:" + (i+1));
            peso[i] = scanner.nextInt();     
         }
    }

    public static int pesoEntre5y80(int [] peso) {
        int contador = 0;
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
            if (peso[i] >= 5 && peso[i] <= 80) {
                contador++;
            }
         }
        return contador;
    }

    public static int pesoMayor80(int [] peso) {
        int contador2 = 0;
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
            if (peso[i] > 80) {
                contador2++;
            }
         }
        return contador2;
    }

    public static int pesoTotal(int [] peso) {
        int suma = 0;
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
         suma = suma + peso[i];
         }
        return suma;
    }

    public static int promedioCarga(int [] peso) {
       
        int suma = 0;
        int longpeso = peso.length;
        for (int i = 0; i < longpeso; i++) {
         suma = suma + peso[i];
        }
        int promedio = suma / longpeso;
        return promedio;
    }

    public static int pesoMayor(int [] peso) {
        int mayor = 0;
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
            if (peso[i] > mayor) {
                mayor = peso[i];
            }
         }
        return mayor;
    }

    public static int pesoMayorPromedio(int [] peso) {
        int contador3 = 0;
        int longpeso = peso.length;
         for (int i = 0; i < longpeso; i++) {
            if (peso[i] > promedioCarga(peso)) {
                contador3++;
            }
         }
        return contador3;
    }



    
}
