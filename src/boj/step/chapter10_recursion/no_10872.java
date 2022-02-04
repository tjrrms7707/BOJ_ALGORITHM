package boj.step.chapter10_recursion;

import java.io.*;

public class no_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x = 1;
        if (N == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= N; i++) {
                x = x * i;
            }
            System.out.println(x);
        }
    }
}
