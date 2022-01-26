package boj.step.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_8958 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int point = 0 ;
            int pre_ans = 0;

            String arr[] = br.readLine().split("");

            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals("O")) {
                    point += 1 + pre_ans;
                    pre_ans++;
                }else
                    pre_ans = 0;
            }

            sb.append(point).append("\n");
        }
        System.out.println(sb);
    }
}
