package boj.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10164 {
    public static void move(int arr[][],int i,int j){
        if(i==0 || j==0){
           arr[i][j] = 1;
        }else{
         arr[i][j] = arr[i-1][j] + arr[i][j-1];
        }
    }
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int P = Integer.parseInt(st.nextToken());

        int answer = 0;
        //P == 0 일때
        if (P==0) {
            int arr[][] = new int[N][M];

            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr[i].length ; j++) {
                    move(arr,i,j);
                }
            }
            answer = arr[N-1][M-1];
        }else{

            // P지점 x와 y 좌표
            int x = (P-1)/M+1;   //P-1 => 딱 떨어지는 마지막
            int y = P%M;

            //시작점 부터 P지점까지 경우의 수 구하기
            int arr1[][] = new int[x][y];
            for (int i = 0; i <arr1.length ; i++) {
                for (int j = 0; j <arr1[i].length ; j++) {
                    move(arr1,i,j);
                }
            }
            answer = arr1[x-1][y-1];

            //P지점부터 끝에까지 경우의 수 구하기
            int arr2[][] = new int[N-x+1][M-y+1];

            for (int i = 0; i <arr2.length ; i++) {
                for (int j = 0; j <arr2[i].length ; j++) {
                    move(arr2,i,j);
                }
            }

            answer = answer * arr2[N-x][M-y];
        }

        System.out.println(answer);
        
    }
}
