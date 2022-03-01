package boj.step.chapter19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class no_18258 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
                continue;
            }
            if(str.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.poll()).append("\n");
                }
                continue;
            }
            if(str.equals("size")){
                sb.append(queue.size()).append("\n");
                continue;
            }

            if(str.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
                continue;
            }

            if(str.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.peek()).append("\n");
                }
            }

            if(str.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.peekLast()).append("\n");
                }
                continue;
            }
        }
        System.out.println(sb);

    }
}

