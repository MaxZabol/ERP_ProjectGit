package src.ruslan.week10;

import java.util.ArrayList;

public class T1_ArrayListInAscending {
    /*
      1.ArrayList - sorting in ascending
      Write a method that can sort the ArrayList in Ascending order without using
      the sort method.
    */

    public static void main(String[] args) {

        ArrayList<Integer> arrayListAsc = new ArrayList<>();

        arrayListAsc.add(45);
        arrayListAsc.add(10);
        arrayListAsc.add(-47);
        arrayListAsc.add(-12);

        for (int i = 0; i < arrayListAsc.size(); i++) {

            for (int j = arrayListAsc.size() - 1; j > i; j--) {
                if (arrayListAsc.get(i) > arrayListAsc.get(j)) {

                    int tmp = arrayListAsc.get(i);
                    arrayListAsc.set(i, arrayListAsc.get(j));
                    arrayListAsc.set(j, tmp);

                }
            }

        }
        for (int i : arrayListAsc) {
            System.out.print(i + " ");
        }
    }
}
