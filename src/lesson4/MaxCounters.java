package lesson4;

import java.util.ArrayList;
import java.util.List;

public class MaxCounters {
    public static void main(String[] args) {

        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        solution(N, A);
    }

    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        List maxList = new ArrayList<>();
        int nowMax = 0;
        for (int aa : A) {
            if (aa >= 1 && aa <= N) {
                if (nowMax > 0 && !maxList.contains(aa)) {
                    result[aa - 1] = nowMax + 1;
                    maxList.add(aa);
                } else {
                    result[aa - 1] = result[aa - 1] + 1;
                }
                if (result[aa - 1] > max) {
                    max = result[aa - 1];
                }
            } else if (aa == N + 1) {
                nowMax = max;
                maxList = new ArrayList<>();
            }
        }
        System.out.println(maxList);
        System.out.println(nowMax);
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            if (nowMax > 0 && !maxList.contains(i + 1)) {
                ans[i] = nowMax;
            } else {
                ans[i] = result[i];
            }
        }

        for (int r : ans) {
            System.out.print(r);
        }

        return result;
    }
}
