package boj.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total=0;
        for(int i=1;i<n+1;i++){
            int yn = hansoo(i);
            if(yn == 1){
                total++;
            }
        }
        System.out.println(total);

    }
    static int hansoo(int n){
        int origin = n;
        int number = n;
        int[] arr = new int[(Integer.toString(n)).length()];
        int cnt=arr.length-1;
        int yn =0;
        while(n != 0){
            number = n%10;
            arr[cnt] = number;
            n = n/10;
            cnt--;
        }
        if(origin<100){
            yn = 1;
        }else {
            int a = (arr[0]-arr[1]);
            for(int i=1;i<arr.length-1;i++){
                if ((arr[i]-arr[i+1])==a){
                    yn =1;
                }else{
                    yn =0;
                    break;
                }
            }
        }
        return yn;
    }
}
