package projetocalculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner fc = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        int numerosoma1 = fc.nextInt();

        // operadors
        System.out.print("Digite o operador: ");
        String operador = fc.next(); // next é usado pq sao operadores.

        System.out.print("Digite o numero para somar: ");
        int numerosoma2 = fc.nextInt();;

        if (operador.equals("+"))
            System.out.print(numerosoma1 + numerosoma2);

        else if (operador.equals("-"))
            System.out.println(numerosoma1-numerosoma2);

        else if (operador.equals("*"))
            System.out.println(numerosoma1 * numerosoma2);

        else if (operador.equals("/"))
            if (numerosoma2 != 0)
            System.out.println(numerosoma1/numerosoma2);
            else
                System.out.println("Não é possivel dividir por 0.");


    }

}
