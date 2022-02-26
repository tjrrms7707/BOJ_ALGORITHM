package boj.step.chapter18_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_10773 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x==0)
                stack.pop();
            else
                stack.push(x);
        }
        int answer = 0;
        while (!stack.empty()){
            answer+=stack.pop();
        }
        System.out.println(answer);
    }
}
