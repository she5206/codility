package lesson5;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        int ans = solution(A);
        System.out.println(ans);
    }

    public static int solution(int[] A) {
        int ans = 0;
        int base = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                base++;
            }
            if (A[i] == 1) {
                ans = ans + base;
                if (ans > 1000000000) {
                    return -1;
                }
            }
        }

        return ans;
    }
}
