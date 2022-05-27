package Armazenandoinformacoes.gravando.nome;

import java.util.Scanner;

public class pessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println(nome + " " + sobrenome);
    }
}