package Class;

import java.util.LinkedList;

public class CombiPermutacion {

    ///////////////////////////////////////////////////////////////
    //--------------PROBLEMAS DE COMBINACION------------------------
    ///////////////////////////////////////////////////////////////
    public static void combSinRep(LinkedList<Object> l1, LinkedList<Object> l2, int n, int r, int i) {
        if (l2.size() == r) {
            System.out.println(l2);
            return;
        }
        int j = i;
        while (j < l1.size()) {
            l2.add(l1.get(j));
            combSinRep(l1, l2, n, r, j + 1);
            l2.removeLast();
            j++;
        }
    }

    public static void combConRep(LinkedList<Object> l1, LinkedList<Object> l2, int n, int r, int i) {
        if (l2.size() == r) {
            System.out.println(l2);
            return;
        }
        int j = i;
        while (j < l1.size()) {
            l2.add(l1.get(j));
            combConRep(l1, l2, n, r, j);
            l2.removeLast();
            j++;
        }
    }

    ///////////////////////////////////////////////////////////////
    //--------------PROBLEMAS DE PERMUTACION------------------------
    ///////////////////////////////////////////////////////////////  
    public static void permSinRep(LinkedList<Object> l1, LinkedList<Object> l2, int n, int r) {
        if (l2.size() == r) {
            System.out.println(l2);
            return;
        }
        int j = 0;
        while (j < l1.size()) {
            if (!l2.contains(l1.get(j))) {
                l2.add(l1.get(j));
                permSinRep(l1, l2, n, r);
                l2.removeLast();
            }
            j++;
        }
    }

    public static void permCombRep(LinkedList<Object> l1, LinkedList<Object> l2, int n, int r) {
        if (l2.size() == r) {
            System.out.println(l2);
            return;
        }
        int j = 0;
        while (j < l1.size()) {
            l2.add(l1.get(j));
            permCombRep(l1, l2, n, r);
            l2.removeLast();
            j++;
        }
    }

    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
        LinkedList<Object> l2 = new LinkedList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        System.out.println(l1);
        //combSinRep(l1, l2, 3, 2, 0);
        //combConRep(l1, l2, 3, 2, 0);
        //permSinRep(l1, l2, 3, 2);
        permCombRep(l1, l2, 3, 2);
    }

}
