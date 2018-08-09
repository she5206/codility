package leetcode;

import java.util.Objects;

public class Q13_RomantoInteger {
    public static void main(String[] args) {
        String a = "MCMXCIV";
        String[] input = a.split("");
        int total = 0;
        boolean skip = false;
        for (int i = 0; i < input.length; i++) {
            if (skip) {
                skip = false;
                continue;
            }

            if (i < input.length - 1) {
                if (Objects.equals(input[i], "I") && Objects.equals(input[i + 1], "V")) {
                    total = total + 4;
                    skip = true;
                    continue;
                }

                if (Objects.equals(input[i], "I") && Objects.equals(input[i + 1], "X")) {
                    total = total + 9;
                    skip = true;
                    continue;
                }

                if (Objects.equals(input[i], "X") && Objects.equals(input[i + 1], "L")) {
                    total = total + 40;
                    skip = true;
                    continue;
                }

                if (Objects.equals(input[i], "X") && Objects.equals(input[i + 1], "C")) {
                    total = total + 90;
                    skip = true;
                    continue;
                }

                if (Objects.equals(input[i], "C") && Objects.equals(input[i + 1], "D")) {
                    total = total + 400;
                    skip = true;
                    continue;
                }

                if (Objects.equals(input[i], "C") && Objects.equals(input[i + 1], "M")) {
                    total = total + 900;
                    skip = true;
                    continue;
                }
            }

            switch (input[i]) {
                case "I":
                    total = total + 1;
                    break;
                case "V":
                    total = total + 5;
                    break;
                case "X":
                    total = total + 10;
                    break;
                case "L":
                    total = total + 50;
                    break;
                case "C":
                    total = total + 100;
                    break;
                case "D":
                    total = total + 500;
                    break;
                case "M":
                    total = total + 1000;
                    break;
            }
        }
        System.out.println(total);
    }
}
