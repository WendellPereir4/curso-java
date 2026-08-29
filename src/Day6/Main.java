package Day6;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6", 2024, 125000+12500); //-> new cria objetos, exem: BMW, x6, 2024. tipo uma pessoa fisica colocar idade,nome

        car.setModelo("X5");
        car.setMarca("Ferrari");

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor do carro: " + car.getValordoCarro());

        //Classe = molde da Pessoa.
        //
        //Objeto = uma pessoa específica.
        //
        //Atributos = nome, peso, idade, data de nascimento.
        //
        //Métodos = ações da pessoa (andar, comer, falar).

    }
}