package boj.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<testCase;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int cnt = 0;
            int[][] arr = new int[W][H];
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr[j].length;k++){
                    N--;
                    if(N==0){
                        System.out.println((k+1)*100+j+1);
                        break;
                    }
                }
            }
        }
    }
}
