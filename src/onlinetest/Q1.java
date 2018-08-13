package kkday;

public class Q1 {
    public static void main(String[] args) {
        // String S = "00-44  48 5555 8361";
        String S = "12345678901234";
        String ans = solution(S);
        System.out.println(ans);
    }

    public static String solution(String S) {
        String[] input = S.split("");

        String result = "";
        for (String i : input) {
            if ("-".equals(i)
                    || " ".equals(i)) {
                continue;
            }
            result += i;
        }
        String[] r = result.split("");
        if (r.length <= 3) {
            return result;
        }

        if (r.length == 4) {
            return r[0] + r[1] + '-' + r[2] + r[3];
        }

        int index3 = 0;
        int index2 = 0;
        if ((r.length - 4) % 3 == 0) {
            index3 = (int) Math.floor((r.length - 4) / 3);
            index2 = 1;
        } else if ((r.length - 2) % 3 == 0) {
            index3 = (int) Math.floor(r.length / 3);
            index2 = 0;
        } else {
            index3 = (int) Math.floor(r.length / 3) - 1;
            index2 = 0;
        }

        String ans = "";
        int flag = 0;
        for (int i = 0; i < r.length; i++) {
            ans = ans + r[i];
            if (index3 > 0 && (flag + 1) % 3 == 0) {
                ans = ans + "-";
                index3--;
                flag = 0;
                continue;
            }
            if (index3 == 0 && index2 > 0 && (flag + 1) % 2 == 0) {
                ans = ans + "-";
                index2--;
                flag = 0;
            }
            flag++;
        }

        return ans;
    }
}
