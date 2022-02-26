package boj.step.chapter12_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_1427 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i]=Integer.parseInt(N.substring(i,i+1));
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i >=0; i--) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
