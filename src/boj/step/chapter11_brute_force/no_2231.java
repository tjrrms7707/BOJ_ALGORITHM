package boj.step.chapter11_brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < N; i++) {
            int x = i;
            int sum = i;
            while (true) {
                sum = sum + x % 10;
                x = x / 10;
                if (x < 10) {
                    sum = sum + x;
                    break;
                }
            }
            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
