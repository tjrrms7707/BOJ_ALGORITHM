package boj.step.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10250 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int X = C/A;
            int x ,y ;
            if(C%A==0){
                y = A * 100 ;
                x = X;

            }else{
                y = (C%A)*100;
                x = X+1;
            }
            sb.append(x+y).append("\n");
        }
        System.out.println(sb);

    }
}
