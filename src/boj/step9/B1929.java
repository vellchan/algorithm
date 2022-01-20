package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i=M;i<=N;i++){
            int cnt=0;
            if(i!=2&&i%2!=0){
                for(int j=1;j<i;j++){
                    if(j%2!=0&&i%j==0){
                        cnt++;
                    }

                }
                if(cnt==1){
                    System.out.println(i);
                }
            }

        }
    }
}
