package boj.step5;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max=0;
        int j=0;
        for(int i=0;i<9;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                j=i+1;
            }
        }
        System.out.println(max+"\n"+j);

    }
}
