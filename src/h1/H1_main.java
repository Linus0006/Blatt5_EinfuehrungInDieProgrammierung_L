package h1;

import java.util.Arrays;

public class H1_main {
    static void main(String[] args) {

        //variables:

        int[] myArray = {1, 3, 5, 11, 15, 10, 17, 19, 2, 5};
        int [] myArrayClone1 = myArray.clone();
        int [] myArrayClone2 = myArray.clone();
        int laenge = myArray.length;

        //Schleife:

        for (int i = 1; i<= laenge; i++){
            myArray [laenge - i] = myArrayClone2[i - 1];
            myArray[i - 1] = myArrayClone1[laenge -i];





        }
        System.out.println(Arrays.toString(myArray));
    }
}
