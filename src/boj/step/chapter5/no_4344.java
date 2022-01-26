package boj.step.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_4344 {
    public static void main(String[] args)throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            StringTokenizer st= new StringTokenizer(br.readLine());

            int S = Integer.parseInt(st.nextToken());
            double arr[] = new double[S];
            double total = 0;
            for (int j = 0; j < S; j++) {
            arr[j] =Double.parseDouble(st.nextToken());
            total +=arr[j];
            }
            total = total/S;
            double count = 0;
            for (int j = 0; j < S; j++) {
                if(arr[j]>total)
                    count++;
            }
            System.out.printf("%.3f%%\n",(count/S)*100);
        }
    }
}
