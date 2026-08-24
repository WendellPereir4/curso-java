package Day3;

import java.util.Scanner;

public class projetocontagemnumero {
    static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu numero: ");

        int contagem1 = leitura.nextInt();

        if (contagem1 <= 9)
            System.out.println("Este número tem 1 digito.");

        else if (contagem1 <= 99)
        System.out.println("Este número tem 2 digitos.");

        else if (contagem1 <= 999)
        System.out.println("Este número tem 3 digitos.");

        else if (contagem1 <= 9999)
            System.out.println("Este número tem 4 digitos.");

        else if (contagem1 >= 99999)
            System.out.println("Este número tem 5 digitos ou mais.");

    }
}