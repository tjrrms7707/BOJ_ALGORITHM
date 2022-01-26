package boj.type.dynamic_pro;

import java.util.Scanner;

public class no_11729 {

    static void move(int no,int x,int y){
        if(no>1)
            move(no-1,x,6-x-y);
        System.out.println(x+" "+y);

        if(no>1){
            move(no-1,6-x-y,y);
        }
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int no = stdIn.nextInt();

        System.out.println(2*no-1);

        for(int i =0;i<2*no-1;i++){

        }
        move(no,1,3);
    }
}
