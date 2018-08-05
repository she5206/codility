package lesson3;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = (int) (-1000 * Math.random() + 500);
            System.out.printf("A[%d]= %d\n", i, +A[i]);
        }
        solution(A);
    }

    public static int solution(int[] A) {

        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }
        System.out.println(A[0] - (A[1] + A[2] + A[3] + A[4]));
        System.out.println(A[0] + A[1] - (A[2] + A[3] + A[4]));
        System.out.println(A[0] + A[1] + A[2] - (A[3] + A[4]));
        System.out.println(A[0] + A[1] + A[2] + A[3] - (A[4]));
        int B[] = new int[A.length];
        int C[] = new int[A.length];
        B[0] = A[0];
        C[A.length - 1] = A[A.length - 1];
        for (int i = 1; i < A.length - 1; i++) {
            B[i] = B[i - 1] + A[i];
            C[A.length - 1 - i] = C[A.length - 1 - i + 1] + A[A.length - 1 - i];
        }

        int ans = 1000;
        for (int i = 0; i < A.length - 1; i++) {
            if (Math.abs(B[i] - C[i + 1]) < ans) {
                ans = Math.abs(B[i] - C[i + 1]);
            }
        }
        System.out.println("ans=" + ans);
        return ans;
    }
}
