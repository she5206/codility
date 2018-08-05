package lesson1;

public class BinaryGap {
    public static void main(String[] args) {
        int N = 561892;
        int[] A = new int[32];
        int i = 0;
        do {
            i++;
            A[i] = N % 2;
            N = N / 2;
            if (N == 1) {
                A[i + 1] = N;
            }
        } while (N >= 2);

        int size = 0;
        int count = 0;
        boolean flag = false;
        for (int aa : A) {
            System.out.print(aa);
            if (!flag && aa == 1) {
                flag = true;
            } else if (flag && aa == 0) {
                count++;
            } else if (flag && aa == 1) {
                if (count > size) {
                    size = count;
                }
                count = 0;
            }
        }
        System.out.println("");

        System.out.println("the longest binary gap is: " + size);
    }
}
