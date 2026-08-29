package day7;

import java.util.Scanner;

public class exer2 {
    static void main(String[] args) {

        Scanner fc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = fc.nextInt();

        if (n % 2 != 1)
            System.out.println(n + " é numero ímpar");

        if (n >= 2 && n < 6)
            System.out.println("Opção A");


        }
    }
