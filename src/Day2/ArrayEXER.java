package Day2;

import java.util.Arrays;

public class ArrayEXER {
    static void main(String[] args) {

        int[] myarray_1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.println(Arrays.toString(myarray_1));
        Arrays.sort(myarray_1);
        System.out.println(Arrays.toString(myarray_1));
// ---------------------------------------------------------------------
        String[] myarray_2 = {"Java","Python","PHP","C#","C Programming",""};
        System.out.println(Arrays.toString(myarray_2));

        Arrays.sort(myarray_2);
        System.out.println(Arrays.toString(myarray_2));





        //System.out.println(Arrays.toString(myarray_2));
    }
}
