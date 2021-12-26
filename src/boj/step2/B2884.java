package boj.step2;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b >= 45){
            System.out.println(a+" "+(b-45));
        }if(b<45){
            if(a==0){
                System.out.println("23 "+(15+b));
            }else{
                System.out.println((a-1)+" "+(15+b));

            }
        }
    }
}
