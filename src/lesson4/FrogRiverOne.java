package lesson4;

import java.util.HashMap;

public class FrogRiverOne {
    public static void main(String[] args) {
        int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int ans = solution(5, A);
        System.out.println(ans);
    }

    public static int solution(int X, int[] A) {
        HashMap map = new HashMap();
        for (int i = 1; i <= X; i++) {
            map.put(i, 1);
        }
        int index = 0;
        for (int aa : A) {
            if (aa > X) {
                continue;
            }
            index++;
            System.out.println(aa);
            if (map.keySet().contains(aa)) {
                map.remove(aa);
            }
            if (map.keySet().size() == 0) {
                return index - 1;
            }
        }
        return -1;
    }
}
