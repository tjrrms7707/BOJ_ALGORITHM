package boj.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_2981 {
    public static boolean check(int arr[], int i) {
        //가장 작은수의 나머지
        int a = arr[0] % i;
        //나머지가 같은지 확인후 리턴
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] % i == a) {
                continue;
            } else {
                return false;
            }
        }
    return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //변수 받아오기
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        //오름차순 정렬
        Arrays.sort(arr);
        //가장 작은 수를 기준으로 2부터 시작해서 나머지 구하기
        for (int i = 2; i <= arr[0]; i++) {
            if(check(arr,i)){
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}
