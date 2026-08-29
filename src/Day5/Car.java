package Day5;

public class Car {

    private String marca; //-> ISSO SÃO VARIAVEIS
    private String modelo;
    private int ano;
    private int valordoCarro;

    Car(String marca, String modelo, int ano, int valordoCarro){
        this.marca = marca; //-> Construtor recebe do Main (ou de quem criar o objeto com new) os valores de cada atributo e inicializa o objeto.
        this.modelo = modelo;
        this.ano = ano;
        this.valordoCarro = valordoCarro;
    }

    public String getMarca() {
        return marca; //-> ISSO É UM METODO.

    }

    public String getModelo() {
        return modelo;

    }

    public int getAno() {
        return ano;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
