package Day3;

public class logicoand {
    static void main(String[] args) {

        // valordoProduto = $20
        // comprar somente entre 10 e 15 dolár

        int precodoProduto = 15;
        boolean buy = precodoProduto >= 10 && precodoProduto <= 15;
        System.out.println(buy);
    }
}
