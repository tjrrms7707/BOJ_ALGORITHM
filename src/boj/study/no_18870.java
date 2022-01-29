package boj.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class no_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //X 갯수 받기
        int N = Integer.parseInt(br.readLine());

        //X 받기
        StringTokenizer st = new StringTokenizer(br.readLine());


        int real[] = new int[N];
        int fake[] = new int[N];

        //배열에 x값 저장
        for (int i = 0; i < N; i++) {
            real[i] = Integer.parseInt(st.nextToken());
            fake[i] = real[i];
        }

        //fake 배열 오름차순 정렬
        Arrays.sort(fake);

        //hashMap의 키값(X) : 순위
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //hashmap의 containsKey를 이용해 key값이 중복되지 않도록 처리
        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(fake[i])) {
                map.put(fake[i], rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(real[i])).append(" ");
        }
        System.out.println(sb);
    }
}
