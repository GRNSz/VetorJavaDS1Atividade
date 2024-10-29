import java.util.Scanner;

public class VetorJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar entrada do usuário
        System.out.println("Por favor, insira 10 valores inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular a soma dos valores
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("Soma dos valores: " + soma);

        // Identificar o maior e menor valor
        int maior = numeros[0];
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibir todos os valores com indicação do maior e menor
        System.out.println("Valores inseridos:");
        for (int numero : numeros) {
            System.out.print(numero);
            if (numero == maior) {
                System.out.print(" (Maior)");
            }
            if (numero == menor) {
                System.out.print(" (Menor)");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static class VetorJava {
    }
}
