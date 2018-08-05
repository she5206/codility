package playgroud;

public class BubbleSort {
    public static void main(String[] args) {
        int[] A = {1, 4, 3, 5, 10, 2};
        int size = A.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
        for (int aa : A) {
            System.out.println(aa);
        }
    }
}
