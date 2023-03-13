package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24416 {
    static int code1Cnt;
    static int code2Cnt;
    static long[] arr;
    static int N;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        arr = new long[N+1];
        code1Cnt = 0;
        code2Cnt = 0;
    }
    public static void main(String[] args) throws IOException {
        input();
        rec_func(N);
        dp_func(N);
        System.out.println(code1Cnt+" "+code2Cnt);
    }
    static long rec_func(int n) {
        if(n == 1 || n == 2) {
            code1Cnt++;
            return 1;
        }
        return rec_func(n-1)+rec_func(n-2);
    }

    static void dp_func(int n) {
        arr[1] = 1;
        arr[2] = 1;

        for(int i=3; i<=N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            code2Cnt++;
        }
    }
}
