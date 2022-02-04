package boj.step.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2292 {
    public static int cal(int i){
        return (i*(i-1))/2+1;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 2;

        if(N == 1){
            System.out.println(1);
        }else{
            while (range<=N){
                range = range + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
