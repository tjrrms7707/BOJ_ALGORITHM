package boj.step.chapter3;

import java.io.*;

public class no_2741 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i =1;i<=N;i++){
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
