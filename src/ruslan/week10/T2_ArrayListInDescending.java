package src.ruslan.week10;

import java.util.ArrayList;

public class T2_ArrayListInDescending {
    /*
      2.ArrayList - sorting in descending order
      Write a method that can sort the ArrayList in descending order without
      using the sort method.
    */

    public static void main(String[] args) {

        ArrayList<Integer> arrayListDesc = new ArrayList<>();

        arrayListDesc.add(110);
        arrayListDesc.add(50);
        arrayListDesc.add(-5);
        arrayListDesc.add(120);

        for (int i = 0; i < arrayListDesc.size(); i++) {

            for (int j = arrayListDesc.size() - 1; j > i; j--) {
                if (arrayListDesc.get(i) < arrayListDesc.get(j)) {

                    int tmp = arrayListDesc.get(i);
                    arrayListDesc.set(i, arrayListDesc.get(j));
                    arrayListDesc.set(j, tmp);

                }
            }

        }
        for (int i : arrayListDesc) {
            System.out.print(i + " ");
        }
    }
}
