package boj.step.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_3052 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Boolean arr[] = new Boolean[43];
        Arrays.fill(arr,Boolean.FALSE);
        int count = 0;
        for(int i =0;i<10;i++){
            int temp = Integer.parseInt(br.readLine())%42;
            System.out.println(temp);
            if(!arr[temp]){
            count++;
            arr[temp]=true;
            }
        }
        System.out.println(count);
    }
}
