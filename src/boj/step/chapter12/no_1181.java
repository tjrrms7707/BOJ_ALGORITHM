package boj.step.chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class no_1181 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] used = new boolean[N];
        Arrays.fill(used,false);
        String[] str = new String[N];
        int[] size = new int[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
            size[i] = str[i].length();
        }

        Arrays.sort(size);
        for (int i = 0; i < N; i++) {
            ArrayList<String> temp = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if(size[i] == str[j].length() && !used[j]){
                    if(temp.contains(str[j])){
                        continue;
                    }
                    temp.add(str[j]);
                    used[j] = true;
                }
            }
            Collections.sort(temp);
            for(String value : temp ){
                sb.append(value).append("\n");
            }
        }
        System.out.println(sb);

    }
}
