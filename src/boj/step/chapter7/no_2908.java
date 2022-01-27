package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2908 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
        sb.delete(0,sb.length());
        int b = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());

        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}
