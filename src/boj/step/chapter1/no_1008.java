package boj.step.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1008 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double N = Double.valueOf(st.nextToken());
        double M = Double.valueOf(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(N/M);

        System.out.println(sb);

    }
}
