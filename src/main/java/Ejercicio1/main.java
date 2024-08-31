package Ejercicio1;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculadora calculadora = new Calculadora();
            int contador = 0;

            while (contador < 5) {

                System.out.print("Primer valor: ");
                int valor1 = scanner.nextInt();

                System.out.print("Segundo valor: ");
                int valor2 = scanner.nextInt();

                System.out.print("Operación (+, -, *, /): ");
                char operacion = scanner.next().charAt(0);

                int resultado = 0;
                boolean operacionValida = true;


                switch (operacion) {
                    case '+':
                        resultado = calculadora.suma(valor1, valor2);
                        break;
                    case '-':
                        resultado = calculadora.resta(valor1, valor2);
                        break;
                    case '*':
                        resultado = calculadora.multiplicacion(valor1, valor2);
                        break;
                    case '/':
                        resultado = calculadora.division(valor1, valor2);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        operacionValida = false;
                }

                if (operacionValida) {
                    System.out.println("Resultado: " + resultado);

                    if (resultado < 0) {
                        System.out.println("Tené cuidado el resultado es negativo!");
                    } else if (resultado >= 0 && resultado < 10000) {
                        System.out.println("Resultado dentro de los límites");
                    } else {
                        System.out.println("Error resultado muy grande");
                    }
                }

                contador++;
            }

            scanner.close();
        }
    }




