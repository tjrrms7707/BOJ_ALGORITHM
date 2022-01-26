package boj.step.chapter3;

import java.io.*;
import java.util.StringTokenizer;

//데이터가 많아질 수록 BufferedWriter가 유리하다.
public class no_15552 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
          //  bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }
        br.close();
        System.out.println(sb);
      //  bw.flush();
      //  bw.close();

    }
}
