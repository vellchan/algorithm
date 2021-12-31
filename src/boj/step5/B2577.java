package boj.step5;

import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        String abc = Integer.toString(a*b*c);
        int[] arr = new int[abc.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = abc.charAt(i)-'0';
        }

        for(int j=0;j<=9;j++){
            cnt=0;
            for(int k=0;k<arr.length;k++){
                if(arr[k]==j){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
