package Day3;

public class operadorTernario {
    static void main(String[] args) {

        int ingresso = 400;
        String TerAcesso;

        if (ingresso >= 500)
            TerAcesso = "VIP";

        else TerAcesso = "Pista";
        System.out.println(TerAcesso);
    }
}
