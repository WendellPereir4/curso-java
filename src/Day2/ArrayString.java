package Day2;

import java.util.Arrays;

public class ArrayString {
    static void main(String[] args) {

        String[] carros = {"BMW" , "Tesla", "JEEP", "FIAT"};
        carros[2] = "Ferrari";
        System.out.println(Arrays.toString(carros));
    }
}
