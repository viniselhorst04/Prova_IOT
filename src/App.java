import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculos calculos = new Calculos();
        double nota1,nota2,nota3;

        System.out.println("-----------------------------------");
        System.out.println("\n--       Calculadora Média       --\n");
        System.out.println("-----------------------------------");
        System.out.print("\nDigite sua primeira nota: ");
        nota1 = scanner.nextDouble();
        calculos.validarNota(nota1);
        System.out.print("\nDigite sua segunda nota: ");
        nota2 = scanner.nextDouble();
        calculos.validarNota(nota2);
        System.out.print("\nDigite sua terceira nota: ");
        nota3 = scanner.nextDouble();
        calculos.validarNota(nota3);

        try {
            System.out.println("Calculando...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        calculos.calculoMedia(nota1,nota2,nota3);

    }
}
