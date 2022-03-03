package boj.step.chapter19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_11866 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <=N ; i++) {
            queue.add(i);
        }

        int start = 1;
        while (!(queue.size()==1)){
            if(start%K==0){
                start = 1;
                sb.append(queue.poll()+", ");
            }else{
                queue.add(queue.poll());
                start++;
            }
        }
        System.out.println("<"+sb+""+queue.poll()+">");
    }
}
