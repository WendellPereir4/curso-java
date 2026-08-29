package day7;

import java.util.Scanner;

public class exer3 {
    static void main(String[] args) {

        Scanner fc = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int num1 = fc.nextInt();

        System.out.print("Digite o operador: ");
        String op = fc.next();

        System.out.print("Digite o número: ");
        int num2 = fc.nextInt();

        if (op.equals("+"))
            System.out.print("Resultado da soma é: " + (num1+num2));

        else if (op.equals("-"))
            System.out.print("Resultado da subtração é: " + (num1-num2));

        else if (op.equals("*"))
            System.out.print("Resultado da multiplicação é: " + (num1*num2));

        else if (op.equals("/"))
            System.out.print("Resultado da divisão é: " + (num1/num2));







    }
}
