package boj.step.chapter18_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_1874 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int stand = 0;

        for (int i = 0; i <N ; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x>stand){
                for (int j = stand+1; j <=x ; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
                stand = x;
            }else {
                if(x==stack.pop()){
                    sb.append("-").append("\n");
                }else{
                    sb.setLength(0);
                    sb.append("NO");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
