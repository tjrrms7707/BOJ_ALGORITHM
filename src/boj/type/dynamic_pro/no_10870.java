package boj.type.dynamic_pro;

import java.util.Scanner;

public class no_10870 {

    static int Fibonacci(int n) {
        if (n >= 2)
            return  Fibonacci(n - 1) + Fibonacci(n - 2);
        if(n==1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);


        int x = stdIn.nextInt();

        System.out.println(Fibonacci(x));

    }
}


