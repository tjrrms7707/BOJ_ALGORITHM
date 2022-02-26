package boj.step.chapter18_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class no_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            //1.push
            if (str.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
                continue;
            }

            //2.pop
            if (str.equals("pop")) {
                if (stack.empty()) {
                    sb.append(-1).append("\n");
                    continue;
                } else {
                    sb.append(stack.pop()).append("\n");
                    continue;
                }
            }

            //3.size
            if (str.equals("size")) {
                sb.append(stack.size()).append("\n");
            }

            //4.empty
            if (str.equals("empty")) {
                if (stack.empty()) {
                    sb.append(1).append("\n");
                    continue;
                } else {
                    sb.append(0).append("\n");
                    continue;
                }
            }

            //5.top
            if (str.equals("top")) {
                if (stack.empty()) {
                    sb.append(-1).append("\n");
                    continue;
                } else {
                    sb.append(stack.peek()).append("\n");
                    continue;
                }
            }
        }

        System.out.println(sb);
    }
}
