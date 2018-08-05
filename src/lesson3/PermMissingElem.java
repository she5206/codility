package lesson3;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 6, 8};
//        int[] A = {1000000, -1000000};
//        int[] A = {0, -2};
        solution(A);
    }

    public static int solution(int[] A) {
        int[] B = new int[1000000];
        for (int i = 0; i < 100000; i++) {
            B[i] = i + 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[A[i] - 1] = 0;
            }
        }

        int ans = -1;
        for (int i = 0; i < B.length; i++) {
            if (B[i] > 0) {
                ans = B[i];
                break;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
