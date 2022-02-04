package boj.step.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2775 {
    public static void main(String[] args)throws IOException {
        int APT[][] = new int[15][15];

        for (int i = 0; i <15 ; i++) {
            APT[0][i] = i;
            APT[i][1] = 1;
        }
        for (int i = 1; i <15 ; i++) {
            for (int j = 2; j <15 ; j++) {
                APT[i][j] =APT[i-1][j] + APT[i][j-1];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < t_case; i++) {
            sb.append(APT[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append("\n");
        }

        System.out.println(sb);
    }

}
