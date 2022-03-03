package boj.step.chapter19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class no_1021 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] order = new int[X];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < X; i++) {
            order[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 0; i <N ; i++) {
            deque.add(i+1);
        }

        int count = 0;
        for (int i = 0; i <X ; i++) {
            int idx = deque.indexOf(order[i]);
            int half_idx ;

            if(deque.size()%2==0){
                half_idx = deque.size()/2 -1;
            }else{
                half_idx = deque.size()/2;
            }

            if(idx<=half_idx){
                for (int j = 0; j < idx; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            }else{
                for (int j = 0; j <deque.size()-idx ; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
