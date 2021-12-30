package boj.step5;

import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[N-1]);
    }
}