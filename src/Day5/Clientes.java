package Day5;

public class Clientes {

    String nomeDoCliente;
    int idadedoCliente;
    int balance;

    Clientes(){
        balance = 10;

    }

    void criarContaNova() { //->  metodo.
        System.out.println(nomeDoCliente + " Conta criada.");
        System.out.println("Novo saldo da conta é " + balance);
    }

}
