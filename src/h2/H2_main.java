package h2;

import java.util.Arrays;

public class H2_main {
    static void main(String[] args) {

        //variables able to change:

        int n = 299;
        int digits = 45;

        //variables not able to change:

        int digitCount = 0;
        int Zaehler = 1;
        int [] a = new int[9];

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

        String ZahlZuZiffer = String.valueOf(n);
        for (int i =1 ; i<= digits;i++){
            a[9-i] = ZahlZuZiffer.charAt(digits-i)-'0';
        }
        System.out.println(Arrays.toString(a));

    }

}
