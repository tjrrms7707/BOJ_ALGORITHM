package boj.step.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1193 {
    public static int cal(int i){
        return (i*(i-1))/2+1;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        for (int i = 1; i <=x ; i++) {
            if(cal(i)<=x &&cal(i+1)>x){
                if(i%2==0){
                    System.out.println((x-cal(i)+1)+"/"+(i-x+cal(i)));
                }else
                    System.out.println((i-x+cal(i))+"/"+(x-cal(i)+1));

                break;
            }
        }
    }
}