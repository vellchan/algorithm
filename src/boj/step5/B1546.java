package boj.step5;

import java.util.Scanner;

public class B1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        float[] arr1 = new float[n];
        float sum = 0;
        float max = 0;

        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            arr1[i] = (arr[i]/max)*100;
            sum += arr1[i];
        }


        System.out.println(sum/n);

    }
}
