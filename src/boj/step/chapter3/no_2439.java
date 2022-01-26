package boj.step.chapter3;

import java.io.*;

public class no_2439 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i =1;i<=N;i++ ){
            for(int j=N;j>0;j--){
                if(i>=j){
                    bw.write("*");
                }
                else
                bw.write(" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
