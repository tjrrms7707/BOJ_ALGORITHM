package boj.step.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2588{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb =new StringBuilder();
        for(int i =0;i<3;i++){
            sb.append(((M/(int)Math.pow(10,i))%10)*N+"\n");
        }
        sb.append(N*M);
        System.out.println(sb);
    }
}
