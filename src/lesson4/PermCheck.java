package lesson4;

public class PermCheck {
    public static void main(String[] args) {
        int A[] = {1, 3, 5, 4, 2};
        int ans = solution(A);
        System.out.println(ans);
    }

    public static int solution(int[] A) {
        int[] B = new int[A.length + 1];
        for (int aa : A) {
            if (aa > B.length -1) {
                return 0;
            }
            B[aa] = 1;
        }
        int ans = 1;
        for (int i = 1; i < B.length; i++) {
            if (B[i] == 0) {
                ans = 0;
            }
        }
        return ans;
    }
}
