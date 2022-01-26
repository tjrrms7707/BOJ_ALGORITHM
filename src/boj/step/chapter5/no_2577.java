package boj.step.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2577 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String total = Integer.toString(a);
        String[] arr_total = total.split("");

        int arr[] = new int[10];

        for(int i=0;i<arr_total.length;i++){
            arr[Integer.parseInt(arr_total[i])]+=1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<10;i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
