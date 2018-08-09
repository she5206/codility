package lesson5;

public class CountDiv {
    public static void main(String[] args) {
//        int A = 0;
//        int B = 2000000;
//        int K = 1;

//        int A = 10;
//        int B = 14;
//        int K = 3;

        int A = 0;
        int B = 0;
        int K = 11;

        int ans = solution(A, B, K);
        System.out.println(ans);
    }

    public static int solution(int A, int B, int K) {

        int ans = 0;
        if ((B - A) == K) {
            if (A % K == 0) {
                return 2;
            } else {
                return 1;
            }
        }

        if ((B - A) < K) {
            if (A == 0 || A % K == 0) {
                return 1;
            }
            return 0;
        }
        if ((B - A) > K) {
            int start = A;
            if (A % K > 0) {
                start = A + (K - (A % K));
            }
            int total = (int) Math.ceil((double) (B - start) / K);
            if (B % K == 0) {
                total = total + 1;
            }
            return total;
        }

        return ans;
    }
}

