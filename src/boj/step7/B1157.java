package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] arr = new int[91];
        int max=0;
        int maxNumber=0;
        for(int i=65;i<arr.length;i++){
            for(int j=0;j<str.length();j++){
                if((str.charAt(j)-0)==i){
                    arr[i]++;
                }
            }
        }

        if(str.length() > 1){
            for(int i=65;i<arr.length;i++){
                if(max<arr[i]){
                    max = arr[i];
                    maxNumber = i;
                }
            }
            Arrays.sort(arr);

            if(arr[89]==arr[90]){
                System.out.println("?");
            }else{
                System.out.println((char)maxNumber);
            }
        }else{
            System.out.println(str);
        }




    }
}
