package boj.step.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_2941 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count =0;
        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)){
                case 'c':
                    if(i<str.length()-1){
                        switch (str.charAt(i+1)){
                            case '=': case '-':
                                i++;
                                break;
                        }
                    }
                    count++;
                    break;
                case 'd':
                    if(i<str.length()-1){
                        switch (str.charAt(i+1)){
                            case '-':
                                i++;
                                break;
                            case 'z' :
                                if(i<str.length()-2) {
                                switch (str.charAt(i+2)){
                                    case '=' :
                                        i+=2;
                                        break;
                                     }
                                }
                        }
                    }
                    count++;
                    break;
                case 'l' :
                    if(i<str.length()-1){
                        switch (str.charAt(i+1)){
                            case 'j' :
                                i++;
                                break;
                        }
                    }
                    count++;
                    break;
                case 'n':
                    if(i<str.length()-1){
                        switch (str.charAt(i+1)){
                            case 'j' :
                                i++;
                                break;
                        }
                    }
                    count++;
                    break;
                case 's' :
                    if(i<str.length()-1){
                        switch (str.charAt(i+1)){
                            case '=' :
                                i++;
                                break;
                        }
                    }
                    count++;
                    break;
                case 'z':
                    if(i<str.length()-1){
                        switch (str.charAt(i+1)){
                            case '=' :
                                i++;
                                break;
                        }
                    }
                    count++;
                    break;
                default:
                    count++;
            }



        }
        System.out.println(count);
    }
}
