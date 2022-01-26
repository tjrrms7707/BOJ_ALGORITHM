package boj.step.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10430 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append((A+B)%C+"\n");
        sb.append(((A%C)+(B%C))%C+"\n");
        sb.append((A*B)%C+"\n");
        sb.append(((A%C)*(B%C))%C+"\n");
        System.out.println(sb);
    }
}
