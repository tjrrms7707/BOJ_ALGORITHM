package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_11720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str_arr[] = br.readLine().split("");

        int total = 0;
        for (int i = 0; i < N; i++) {
            total += Integer.parseInt(str_arr[i]);
        }
        System.out.println(total);
    }
}
