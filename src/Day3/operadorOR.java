package Day3;

public class operadorOR {
    static void main(String[] args) {
        //boolean TemEmprego = true;
        //boolean TemEmpresa = false;
        //boolean Tem50MIL = false;
       //boolean podeFinanciar = (TemEmprego || TemEmpresa) && Tem50MIL;
        //System.out.println(podeFinanciar);

        boolean NomeLimpo = true;
        boolean TemEmpregoOuEmpresa = false;
        boolean Tem50MIL = true;

        boolean PodeFinanciar = (NomeLimpo || TemEmpregoOuEmpresa) && Tem50MIL;
        System.out.println(PodeFinanciar);

    }
}
