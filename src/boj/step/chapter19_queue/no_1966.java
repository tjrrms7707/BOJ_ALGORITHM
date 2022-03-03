package boj.step.chapter19_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_1966 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> queue2 = new LinkedList<>();
            int K = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int[] order = new int[K];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                order[j] = Integer.parseInt(st.nextToken());
                queue.add(order[j]);
                queue2.add(j);
            }

            Arrays.sort(order);
            int start = 1;

            loop:  for (int j = K - 1; j >= 0; j--) {
                while (true) {
                    if (queue.peek() == order[j]) {
                        if (queue2.peek() == X) {
                            sb.append(start).append("\n");
                            break loop;
                        } else {
                            queue.poll();
                            queue2.poll();
                            start++;
                            break;
                        }

                    } else {
                        queue.add(queue.poll());
                        queue2.add(queue2.poll());
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
