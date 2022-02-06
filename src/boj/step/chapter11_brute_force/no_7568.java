package boj.step.chapter11_brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_7568 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] size = new int[N][2];

        for (int i = 0; i <N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j <2 ; j++) {
                size[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) {
            int count = N+1 ;
            for (int j = 0; j < N; j++) {
                if(size[i][0] >= size[j][0] || size[i][1] >= size[j][1]){
                    count--;
                }
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
