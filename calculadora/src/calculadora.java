import java.util.InputMismatchException;
import java.util.Scanner;


public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** Aplicación calculadora ****");
        mostrarMenu();
        try {
            int usuarioEleccion = scanner.nextInt();
            scanner.nextLine();
            if (usuarioEleccion == 5){
                System.out.println("Gracias por usar mi calculadora :)");
                return;
            }
            if (usuarioEleccion < 0 || usuarioEleccion > 5){
                System.out.println("Incorrecto, escoje una opción valida");
            } else {
                System.out.println("introduce el primer numero");
                double num1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("introduce el segundo onumero");
                double num2 = scanner.nextInt();
                scanner.nextLine();

                if (Double.isNaN(num1) || Double.isNaN(num2)){
                    System.out.println("Error, uno de los valores no es valido");
                }
                switch(usuarioEleccion) {
                    case 1:
                        double resultado = num1 + num2;
                        System.out.println("El resultado de la suma es " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("El resultado de la resta es " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("El resultado de la multiplicación es " + resultado);
                        break;
                    case 4:
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es " + resultado);
                        break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Incorrecto, elige una opcion valida");
            scanner.nextLine();
        }
        scanner.close();
        }

        private static void mostrarMenu(){

            System.out.println("Selecciona que quieres hacer");
            System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
        }
    }