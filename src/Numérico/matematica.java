package Numérico;

import java.util.Scanner;

public class matematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        Double number = scanner.nextDouble();
        System.out.println("Digite outro valor: ");
        Double number2 = scanner.nextDouble();
        System.out.println(number + number2);

    }
}