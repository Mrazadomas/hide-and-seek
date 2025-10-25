package org.example;
import java.util.ArrayList;

public class FuzzyFinder {
    public int linearSearch(ArrayList<Fuzzy> f) {
        for (int i = 0; i < f.size(); i++) {
            if ((f.get(i).color).equals("gold")) {
                return i;
            }
        }
        return -1;
    }

    

    public int binarySearch(int l, int u, ArrayList<Fuzzy> f) {
        if (u >= l) {
            int m = (l + u) / 2;

            if ((f.get(m).color).equals("gold")) {
                return m;
            } else if ((f.get(m).color).compareTo("gold") > 0) {
                return binarySearch(l, m - 1, f);
            } else if ((f.get(m).color).compareTo("gold") < 0) {
                return binarySearch(m + 1, u, f);
            } 
        }
        return -1;
    }    
}
