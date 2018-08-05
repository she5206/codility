package lesson2;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        // int[] A = {3, 8, 9, 7, 6};
        int K = 5;
        int B[] = solution(A, K);
        for (int bb : B) {
            System.out.print(bb + " ");
        }
    }

    private static int[] solution(int[] A, int K) {
        int size = A.length;
        if (size < 1) {
            return A;
        }
        K = K % size;
        int[] B = new int[size];

        int index = 0;
        for (int i = size - K; i < size; i++) {
            B[index++] = A[i];
        }
        int index2 = K;
        for (int i = 0; i < size - K; i++) {
            B[index2++] = A[i];
        }
        return B;
    }
}
