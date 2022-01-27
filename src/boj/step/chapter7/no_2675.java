package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2675 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());

            String arr[] = st.nextToken().split("");
            for (int j = 0; j < M*arr.length; j++) {
                sb.append(arr[j/M]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
