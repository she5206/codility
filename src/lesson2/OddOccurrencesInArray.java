package lesson2;

import java.util.HashMap;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {1, 1, 3, 3, 5, 9, 9};
        int ans = solution(A);
        System.out.println(ans);
    }

    public static int solution(int[] A) {
        HashMap map = new HashMap();
        for (int aa : A) {
            if (map.containsKey(aa)) {
                map.remove(aa);
            } else {
                map.put(aa, 1);
            }
        }
        return (int) map.keySet().toArray()[0];
    }
}
