package Day5;

public class OrganizandoCodigo {
    static void main(String[] args) { // -> 1 EXECUTOU O MAIN, DPS CHAMOU O METODO DE BAIXO, E RETORNOU 2 VEZES
        listaDeProdutos("Laranja", 12);
        listaDeProdutos("Banana", 17);
    }

    public static void listaDeProdutos(String nomeDoProduto, Integer valorDeProduto) {
        System.out.println(nomeDoProduto + " - " + valorDeProduto);
    }
}
