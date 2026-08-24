package projetocalculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calc {
    static void main(String[] args) {

        Scanner fc = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        int numerosoma1 = fc.nextInt();

        System.out.print("Digite o operador: ");
        String operador = fc.next();

        System.out.print("Digite o numero para somar: ");
        int numerosoma2 = fc.nextInt();;


       if (operador == "+");
        System.out.println(numerosoma1 + numerosoma2);



    }

}
