package kkday;

public class Q2 {
    public static void main(String[] args) {
        int[] A = {1};
        int X = 0;
        int ans = solution(A, X);
        System.out.println(ans);
    }

    public static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while ((l + 1) < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (l > 0 && A[l - 1] == X) {
            return l - 1;
        } else if (A[l] == X) {
            return l;
        } else if (A[r] == X) {
            return r;
        }

        return -1;
    }
}
