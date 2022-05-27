package exercicio;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeira Nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Segunda Nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Terceira Nota: ");
        int nota3 = scanner.nextInt();
        System.out.println(nota1 + nota2 + nota3);
        int media = (nota1 + nota2 + nota3) / 3;
        if (media >= 6) {
            System.out.println("Aprovado ");
        } else {
            System.out.println("Reprovado ");
        }


    }
}
