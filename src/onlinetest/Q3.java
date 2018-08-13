package kkday;

public class Q3 {
    public static void main(String[] args) {
        int N = 11;
        int ans = solution(N);
        System.out.println(ans);
    }

    public static int solution(int N) {
        int size = 14;
        int[] A = new int[size];
        int[] B = new int[size];
        int[] C = new int[size];

        A[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < size - 1; j++) {
                B[j + 1] = A[j];
            }
            int flag = 0;
            for (int j = size - 1; j >= 0; j--) {
                C[j] = A[j] + B[j] + flag;
                flag = 0;
                if (C[j] >= 10 && j > 0) {
                    flag = (int) Math.floor(C[j] / 10);
                    C[j] = C[j] % 10;
                }
            }

            if (C[0] > 10) {
                A[0] = (int) Math.floor(C[0] / 10);
                A[1] = C[0] % 10;
                for (int j = 2; j < C.length; j++) {
                    A[j] = C[j - 1];
                }
            } else {
                for (int j = 0; j < C.length; j++) {
                    A[j] = C[j];
                }
            }
        }
        int count = 0;
        for (int c : C) {
            System.out.println(c);
            if (c == 1) {
                count++;
            }
            //System.out.println(c);
        }
        return count;
    }
}
