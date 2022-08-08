/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Construa um programa que leia um número inteiro e imprima a informação se este número é ou não divisível
    por 5.
 */
import java.util.Scanner;

public class DivisivelPor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = scanner.nextInt();
        if (num % 5 == 0){
            System.out.println("Numero divisivel por 5");
        }
        else {
            System.out.println("Numero nao divisivel por 5");
        }
    }
}
