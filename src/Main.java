import java.util.Scanner;

/**
 * Clase Principal de la calculadora
 */
public class Main
{
    public static void main(String[] args)
    {
        //Creacion del objeto Scanner
        Scanner entrada = new Scanner(System.in);

        //Pedimos los datos de entrada al usuario
        System.out.println("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();

        //Creamos un objeto de tipo calculadora
        Calculadora calculadora = new Calculadora();

        //Realizamos las operaciones correspondientes
        int suma = calculadora.suma(num1, num2);
        int resta = calculadora.resta(num1, num2);
        int multiplicacion = calculadora.multiplicacion(num1, num2);
        int division = calculadora.division(num1, num2);

        //Impresion los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }
}
