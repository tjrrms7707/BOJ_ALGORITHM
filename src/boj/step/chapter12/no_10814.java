package boj.step.chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_10814 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] str = new String[N][2];

        for (int i = 0; i <N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        Arrays.sort(str ,(e1,e2)->{
            int a = Integer.parseInt(e1[0]);
            int b = Integer.parseInt(e2[0]);
            if(a==b){
                return a-b;
            }
            else{
                return a-b;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            sb.append(str[i][0]+" "+str[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
