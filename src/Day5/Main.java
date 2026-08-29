package Day5;

public class Main {
    public static void main(String[] args) {

        Clientes c001 = new Clientes(); //-> objeto usando instancia da classe cliente
        c001.nomeDoCliente = "Wendell";
        c001.idadedoCliente = 22;

        Clientes c002 = new Clientes();
        c002.nomeDoCliente = "Emelly";
        c002.idadedoCliente = 22;


        System.out.print(c002.idadedoCliente);
        c002.criarContaNova();

    }
}
