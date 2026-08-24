package Day1;

import java.util.Scanner;

public class input {
    static void main() {
        Scanner idade = new Scanner(System.in); // - FUNÇÃO DO SCANNER
        System.out.println("Digite sua idade: "); // - OQ O USUÁRIO PRECISA DIGITAR

        String idadecliente = idade.nextLine(); // -> Pega informação do scanner e armazena dentro da varriavel idadecliente
        System.out.println(idadecliente);
    }
}
