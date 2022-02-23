package boj.step.chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] mode = new int[8001];

        int mid = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            mid += arr[i];
            mode[arr[i] + 4000]++;
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append((int)Math.round((double)mid / N)).append("\n");        //평균
        sb.append(arr[(N + 1) / 2-1]).append("\n");   //중앙값

        int[][] idx = {{0,8001},{0,8001}};
        for (int i = 0; i < N; i++) {
            if(idx[0][1] == arr[i] || idx[1][1] == arr[i]){
                continue;
            }
            if (mode[arr[i] + 4000] > idx[1][0]) {
                idx[0][0] = idx[1][0];
                idx[0][1] = idx[1][1];
                idx[1][0] = mode[arr[i] + 4000];
                idx[1][1] = arr[i];
            } else if (mode[arr[i] + 4000] == idx[1][0]) {
                if (arr[i] <= idx[1][1]) {
                    idx[0][0] = idx[1][0];
                    idx[0][1] = idx[1][1];
                    idx[1][0] = mode[arr[i] + 4000];
                    idx[1][1] = arr[i];
                } else if(mode[arr[i] + 4000] > idx[0][0]){
                    idx[0][0] = mode[arr[i] + 4000];
                    idx[0][1] = arr[i];
                }else if (arr[i] <= idx[0][1]) {
                    idx[0][0] = mode[arr[i] + 4000];
                    idx[0][1] = arr[i];
                }
            }else if(mode[arr[i]+4000]>idx[0][0]) {
                idx[0][0] = mode[arr[i] + 4000];
                idx[0][1] = arr[i];
            }else if(mode[arr[i]+4000]==idx[0][0]){
                if(arr[i]<idx[0][1]){
                    idx[0][0] = mode[arr[i] + 4000];
                    idx[0][1] = arr[i];
                }
            }
        }
        if (idx[0][0] == idx[1][0]) {
            sb.append(idx[0][1]).append("\n");
        }else {
            sb.append(idx[1][1]).append("\n");
        }
        sb.append(arr[N - 1] - arr[0]); //차이값

        System.out.println(sb);
    }

}
