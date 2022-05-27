package exercicio;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a Base: ");
        int base = scanner.nextInt();
        System.out.println("Informe a Altura: ");
        int altura = scanner.nextInt();
        int resultado = (base * altura);
        System.out.println("O Tamanho da área é: " + resultado);

    }
}