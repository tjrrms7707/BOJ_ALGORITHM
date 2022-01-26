package boj.step.chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class no_1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int cicle = 0;
        int cicle_num = N;


        do{
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cicle++;
        }while (cicle_num != N);
        System.out.println(cicle);
    }
}
