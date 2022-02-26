package boj.step.chapter12_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str , (str1,str2)->{
            if(str1.length() == str2.length()){
                return str1.compareTo(str2); //사전순 정렬
            }else {
                return str1.length() - str2.length();
            }
        });
        sb.append(str[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if(str[i].equals(str[i-1])){
                continue;
            }
            sb.append(str[i]).append("\n");
        }
        System.out.println(sb);
    }
}
