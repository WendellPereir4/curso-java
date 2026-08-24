package Day2;

public class math {
    static void main(String[] args) {
        double valor = Math.round(10.2); // - rorund para arredondar
        double valor2 = Math.ceil(10.2); // - arrendondar para cima.
        double valor3 = Math.floor(10.2); // - arrendondar para baixo.
        int valor4 = (int)Math.round(Math.random()*100);

        System.out.println(valor);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);

    }
}
