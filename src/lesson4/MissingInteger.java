package lesson4;

public class MissingInteger {
    public static void main(String[] args) {
//        int A[] = {1,2,3,4};
        int A[] = {-100, 1, 100};
        int ans = solution(A);
        System.out.println(ans);
    }

    public static int solution(int[] A) {
        int[] B = new int[A.length + 1];
        int size = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0 || A[i] > B.length - 1) {
                continue;
            } else {
                size++;
                B[A[i]] = 1;
                System.out.printf("B[%d]=%d\n", A[i], 1);
            }
        }
        if (B[1] == 0) {
            return 1;
        }
        int last = 1;
        for (int i = 1; i <= size; i++) {
            if (B[i] == 1) {
                last = i;
            }
            if (B[i] == 0) {
                break;
            }
        }
        if (last == size) {
            return last + 1;
        } else if (last < size && B[last + 1] == 0) {
            return last + 1;
        } else {
            return last;
        }
    }
}
