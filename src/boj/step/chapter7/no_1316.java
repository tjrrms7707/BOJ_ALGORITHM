package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = N;
        for (int i = 0; i < N; i++) {
            String str[] = br.readLine().split("");

            if(str.length==1){
                continue;
            }
          loop:  for (int j = 0; j < str.length-1; j++) {
                if(str[j].equals(str[j+1])){
                    continue;
                }else{
                    for (int k = j+1; k <str.length ; k++) {
                        if(str[j].equals(str[k])){
                            ans--;
                            break loop;
                        }
                    }
                }
            }

        }
        System.out.println(ans);
    }
}
