package projetocalculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calc {
    static void main(String[] args) {

        Scanner fc = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        int numerosoma1 = fc.nextInt();

        // operador
        System.out.print("Digite o operador: ");
        String mais = fc.next();
        String menos = fc.next();



        System.out.print("Digite o numero para somar: ");
        int numerosoma2 = fc.nextInt();;

        if (mais == "+")
        System.out.println(numerosoma1 + numerosoma2);

        else if (menos == "-");
        System.out.println(numerosoma1-numerosoma2);



    }

}
