package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculadora_correta operacoes = new calculadora_correta();

        System.out.println("Selecione a operação:");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");
        System.out.print("Digite o número da operação desejada: ");

        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        try {
            switch (operacao) {
                case 1:
                    resultado = operacoes.adicionar(num1, num2);
                    break;
                case 2:
                    resultado = operacoes.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = operacoes.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = operacoes.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    operacaoValida = false;
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("O resultado da operação é: " + resultado);
        }

        scanner.close();
    }
}