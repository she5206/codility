package lesson3;

public class FrogJmp {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 100;
        int ans = solution(X, Y, D);
        System.out.println(ans);
    }

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
