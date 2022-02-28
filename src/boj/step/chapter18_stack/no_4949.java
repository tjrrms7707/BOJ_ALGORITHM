package boj.step.chapter18_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_4949 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
            Stack<String> stack = new Stack<>();

            for (int i =0;i<str.length();i++){
                String x = str.substring(i,i+1);
                if(x.equals("(") || x.equals("[")) {
                    stack.push(x);
                    continue;
                }

                if(x.equals(")")){
                    if(stack.empty() || stack.peek().equals("[")){
                        sb.append("no").append("\n");
                        break;
                    }else{
                        stack.pop();
                        continue;
                    }
                }
                if(x.equals("]")){
                    if(stack.empty() || stack.peek().equals("(")){
                        sb.append("no").append("\n");
                        break;
                    }else{
                        stack.pop();
                        continue;
                    }
                }
                if(x.equals(".")){
                    if(stack.empty()){
                        sb.append("yes").append("\n");
                    }else{
                        sb.append("no").append("\n");
                    }
                }
            }

        }
        System.out.println(sb);
    }
}
