package Teacher;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MultiplicationTable multiplicationTable = new MultiplicationTable();

        System.out.println(multiplicationTable);

        Pair pair = new Pair(9, 8);
        Pair pair1 = new Pair(8, 9);
        Pair pair2 = new Pair(3, 9);
        Pair pair3 = new Pair(4, 5);
        Pair pair4 = new Pair(6, 2);
        Pair pair5 = new Pair(7, 5);
        Pair pair6 = new Pair(3, 3);
        Pair pair7 = new Pair(6, 9);
        Pair pair8 = new Pair(8, 8);
        Pair pair9 = new Pair(5, 5);
        Pair pair10 = new Pair(4, 4);
        Pair pair11 = new Pair(6, 6);
        Pair pair12 = new Pair(9, 9);
        Pair pair13 = new Pair(2, 2);
        Pair pair14 = new Pair(5, 9);
        Pair pair15 = new Pair(8, 9);
        Pair pair16 = new Pair(6, 3);
        Pair pair17 = new Pair(3, 7);
        Pair pair18 = new Pair(7, 4);
        Pair pair19 = new Pair(4, 8);


        Set <Pair> set = new HashSet<>();

        set.add(pair);
        set.add(pair1);
        set.add(pair2);
        set.add(pair3);
        set.add(pair4);
        set.add(pair5);
        set.add(pair6);
        set.add(pair7);
        set.add(pair8);
        set.add(pair9);
        set.add(pair10);
        set.add(pair11);
        set.add(pair12);
        set.add(pair13);
        set.add(pair14);
        set.add(pair15);
        set.add(pair16);
        set.add(pair17);
        set.add(pair18);
        set.add(pair19);


        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }




    }


}