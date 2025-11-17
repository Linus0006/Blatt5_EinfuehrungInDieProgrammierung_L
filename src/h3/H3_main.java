package h3;

import java.util.Arrays;

public class H3_main {
    static void main(String[] args) {

        //Deklarieren:

        int [] [] einheiten  = new int[2][15];
        einheiten[0] = new int [] {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int input = 0;  //veränderbar

        //testing input:

        for (int i = 1; i<=15; i++){
            for (int f = 1; input-einheiten[0][i-1] >= 0; f++){
                input =input - einheiten[0][i-1];
                einheiten[1][i-1] = f;
            }
        }




        System.out.println(Arrays.deepToString(einheiten));
        System.out.println(input);
    }
}
