package Day4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) // -> FORA
            for (int j = 0; j < 2; j++) // -> DENTRO
                System.out.println(i + " " + j);
    }
}
