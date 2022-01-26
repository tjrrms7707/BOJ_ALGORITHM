package boj.step.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2739 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        for(int i =1;i<10;i++){
            sb.append(x+" * "+i+" = "+i*x);
            if(i<9){
            sb.append("\n");}
        }
        System.out.println(sb);

    }
}
