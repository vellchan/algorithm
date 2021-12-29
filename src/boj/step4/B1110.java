package boj.step4;


import java.io.IOException;
import java.util.Scanner;

public class B1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a=0;
        int b=0;
        int i=0;
        String c = str;
        if(Integer.parseInt(str) < 10){
            c = "0"+str;
            str = c;
        }
        while (true){
            if(i==0){
                a = c.charAt(0)-'0';
                b = c.charAt(1)-'0';
                c = Integer.toString(a+b);
            }else{
                a = b;
                b = Integer.parseInt(Character.toString(c.charAt(c.length()-1)));
                c = Integer.toString(a+b);
            }
            i++;
            if((Integer.toString(b)+Character.toString(c.charAt(c.length()-1))).equals(str)){
                break;
            }
        }
        System.out.println(i);
    }
}
