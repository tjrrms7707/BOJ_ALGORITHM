package boj.step.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2839 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        int max = M/5;

        for (int i = max; i >=-1 ; i--) {
            if(i<0){
                System.out.println(-1);
                break;
            }else{
                int a = M-(i*5);
                if(a%3==0){
                    System.out.println((i+a/3));
                    break;
                }
            }
        }
    }
}
