package Day3;

public class IFELSE {
    static void main(String[] args) {

        int ValorCarro = 90_00;
        if (ValorCarro > 100_00)

            System.out.println("Valor alto pra caralho.");

        else if (ValorCarro >= 90_00 && ValorCarro <= 100_000)
            System.out.println("Comprar carro.");

        else
            System.out.println("Não comprar, valor abaixo da tabela");




    }
}
