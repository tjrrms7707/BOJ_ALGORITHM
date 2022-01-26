package boj.step.chapter4;

import java.io.*;
import java.util.StringTokenizer;

public class no_10952 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0){
                break;
            }
            bw.write(a+b+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
