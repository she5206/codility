package playgroud;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        for (int i = 4; i < 1000; i++) {
            boolean flag = false;
            for (int priorPrime : primes) {
                if (i % priorPrime == 0) {
                    flag = true;
                    break;
                }
                if (i < priorPrime * 2) {
                    break;
                }
            }
            if (!flag) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
}
