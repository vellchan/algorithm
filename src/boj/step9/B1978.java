package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int primeNumber = 0;
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for(int j=1;j<num;j++){
                if(num%j==0){
                    cnt++;
                }
            }
            arr[i] = cnt;
            if(arr[i]==1){
                primeNumber++;
            }
        }
        System.out.println(primeNumber);

    }
}
