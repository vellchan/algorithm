package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = N;
        for(int i=M;i<=N;i++){
            int cnt=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==1){
                sum+=i;
                if(i<min){
                    min = i;
                }
            }
        }
        if (sum==0){
            System.out.println("-1");
        }else{
            System.out.println(sum+"\n"+min);
        }
    }
}
