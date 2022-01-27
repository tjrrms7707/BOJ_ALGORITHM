package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1157 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int alphabet[] = new int[26];

        for (int i = 0; i <str.length() ; i++) {
            alphabet[(int)str.charAt(i)-65]+=1;
        }
        int count = 0;
        int idx = 0;
        int double_check = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i]>=count){
                if(alphabet[i]==count){
                    double_check =1;
                }else{
                    count=alphabet[i];
                    idx = i;
                    double_check =0;
                }
            }
        }
        if(double_check==1){
            System.out.println("?");
        }else{
            System.out.println((char)(idx+65));
        }
    }
}
