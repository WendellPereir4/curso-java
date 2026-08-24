package Day3;

import java.text.NumberFormat;

public class formatando {
    static void main(String[] args) {
        NumberFormat pound = NumberFormat.getCurrencyInstance(); // - formtador de numeros, getCurrencyInstance(); formatador de moedas.
        String valordeProduto = pound.format(120.80);
        System.out.println(valordeProduto);
    }
}
