package playgroud;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 9, 2, 4};
        int[] ans = new int[A.length];
        int max = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] > max) {
                    max = A[j];
                    index = j;
                }
            }
            ans[i] = max;
            A[index] = 0;
            max = 0;
        }
        for (int aa : ans) {
            System.out.print(aa + " ");
        }
    }
}
