//Intellis töötab kood ilusti, 09.12.2020;

import java.util.ArrayList;

public class OunaSorteerija {
    public static void main(String[] args) {

        int[] apples = { 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65};

        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> medium = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();

        //Luuakse tsükkel, kus hakatakse numbrid läbi käima
        for (int i = 0; i < apples.length; i++) {
            Integer apple = apples[i]; // Apple muutuja tüüp oli puudu Integer
            if (apple <= 50) {
                small.add(apple); //Add meetod vajab midagi mida lisada
            } else if (apple >= 71) {
                big.add(apple);
            } else {
                medium.add(apple);
            }
        }

        System.out.println("Small" + small);
        System.out.println("Big" + big);
        System.out.println("Medium" + medium);

    }
}