package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_10809 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        int ans[] = new int[26];
        Arrays.fill(ans,-1);

        for (int i = 0; i < str.length(); i++) {
            if(ans[(int)str.charAt(i)-97]==-1)
             ans[(int)str.charAt(i)-97] = i;
        }
        for (int i = 0; i < ans.length; i++) {
            sb.append(ans[i]+" ");
        }
        System.out.println(sb);
    }
}
