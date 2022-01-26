package boj.step.chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class no_10871 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp<X)
                bw.write(temp+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
