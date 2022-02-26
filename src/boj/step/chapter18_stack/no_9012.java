package boj.step.chapter18_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            Stack<String> stack = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                if (str.substring(j, j + 1).equals("(")) {
                    stack.push("(");
                } else {
                    if (stack.empty()) {
                        stack.push("NO");
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
