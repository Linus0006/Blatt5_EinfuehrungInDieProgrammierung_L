package h2;

import java.util.Arrays;

public class H2_main {
    static void main(String[] args) {

        //variables able to change:

        int n = 299876890;
        int digits = 45;

        //variables not able to change:

        int digitCount = 0;
        int Zaehler = 1;
        int [] a = new int[9];
        int divisorZaehler = 0;

        //Anzahl Ziffern ermitteln:

        while (n>= Zaehler){
            digitCount++;
            Zaehler = Zaehler * 10;
        }
        if (n == 0){
            digitCount = 1;
        }

        digits = digitCount;
        System.out.println(digits);

        //Belegung in Array:

        while (n>0){
            int Rest = n % 10;
            a[8-divisorZaehler] = Rest;
            n = n/10;
            divisorZaehler++;
        }

        System.out.println(Arrays.toString(a));

    }

}
