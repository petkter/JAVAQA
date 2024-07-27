import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner mmgvo = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora ");
        int op = 0;
        int numerouno = 0;
        int numerodos = 0;
        int resultado = 0; 
        System.out.println("Elija una opcion de calculo ");
        System.out.println("Digite el numero 1 para adicion ");
        System.out.println("Digite el numero 2 para substracion ");
        System.out.println("Opcion: ");
        op = mmgvo.nextInt(); 
        do {
        switch (op) {
            case 1: 
                System.out.println("Digite dos numeros: ");
                numerouno = mmgvo.nextInt();
                numerodos = mmgvo.nextInt();
                resultado = numerouno + numerodos; 
                System.out.println("Resultado " + resultado);
                op = 3;
                break;
            case 2:
                System.out.println("Digite dos numero: ");
                numerouno = mmgvo.nextInt();
                numerodos = mmgvo.nextInt();
                resultado = numerouno - numerodos;
                System.out.println("Resultado: " + resultado);
                op = 3;
                break;
            default:
                break;
        }
            
        } while (op!=3);
    }
}
