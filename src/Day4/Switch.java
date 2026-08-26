package Day4;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {

        // coletar dado do produto
        System.out.print("Digite nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomedoproduto = s.next().toLowerCase(); // -> se o usuário digitar maisculo, o sistema imprimi como minisculo.
        //retornar valor do produto

        switch (nomedoproduto) {
            case "banana":
                System.out.println("R$9,50");
                break;

            case "manga":
                System.out.println("R$12,80");
                break;

            case "abacate":
                System.out.println("R$16,10");
                break;
    }

    }
}
