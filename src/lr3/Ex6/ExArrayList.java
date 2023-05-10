package lr3.Ex6;

import java.util.ArrayList;

public class ExArrayList {
    public static int Ar_list(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        System.out.println("The survivor is: " + Ar_list(n, k));
    }
}
