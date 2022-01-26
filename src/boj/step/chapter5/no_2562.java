package boj.step.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2562 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int idx = 0;
        int max = 0;
        for(int i=0;i<9;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp>max){
                idx = i;
                max = temp;
            }
        }
        System.out.println(max+"\n"+(idx+1));
    }
}
