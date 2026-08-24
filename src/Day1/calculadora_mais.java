package Day1;

import java.util.Scanner;

public class calculadora_mais {
    public static void main(String[] args) {

        Scanner numero1 = new Scanner(System.in);
        System.out.print("Digite o numero para somar: ");
        float soma1 = numero1.nextFloat();

        Scanner numeror2 = new Scanner(System.in);
        System.out.print("Digite o numero novamente para somar: ");
        float soma2 = numeror2.nextFloat();

        System.out.println("total da soma é:" + (soma1 + soma2)); //-> entre parenteses para forçar a soma das duas variaveis.

    }
}
