import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo.");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[5] - Média");
        float valor = scanner.nextFloat();

        if (valor ==  1){
            System.out.println("Valor 1: ");
            float valor1Soma = scanner.nextFloat();
            System.out.println("Valor 2: ");
            float valor2Soma = scanner.nextFloat();
            float resulSoma = valor1Soma + valor2Soma;
            System.out.println("O resultado é: " + resulSoma);
        } else if (valor == 2) {
            System.out.println("Valor 1: ");
            float valor1Sub = scanner.nextFloat();
            System.out.println("Valor 2: ");
            float valor2Sub = scanner.nextFloat();
            float resulSub = valor1Sub - valor2Sub;
            System.out.println("O resultado é: " + resulSub);
        } else if (valor == 3) {
            System.out.println("Valor 1: ");
            float valor1Multi = scanner.nextFloat();
            System.out.println("Valor 2: ");
            float valor2Multi = scanner.nextFloat();
            float resulMulti = valor1Multi * valor2Multi;
            System.out.println("O resultado é: " + resulMulti);
        } else if (valor == 4) {
            System.out.println("Valor 1: ");
            float valor1Divi = scanner.nextFloat();
            System.out.println("Valor 2: ");
            float valor2Divi = scanner.nextFloat();
            float resulDivi = valor1Divi /   valor2Divi;
            System.out.println("O resultado é: " + resulDivi);
        } else if (valor == 5) {
            System.out.print("Quantidade de valores: ");
            int quantidade1 = scanner.nextInt();
            float soma1 = 0;

            for (int i = 1; i <= quantidade1; i++) {
                System.out.print("Valor " + i + ": ");
                float valor1 = scanner.nextFloat();
                soma1 += valor1;
            }

            float resultado1 = soma1 / quantidade1;
            System.out.println("A média é: " + resultado1);
        } else {
            System.out.println("Opção invalida");
        }

        scanner.close();
    }
}
