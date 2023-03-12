package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2748 {
    static int N;
    static long[] arr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        arr = new long[N+1];

        for(int i=0; i<N+1; i++){
            arr[i] = -1;
        }
        arr[0] = 0;
        arr[1] = 1;

    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(fibonacciFunc(N));
    }

    static long fibonacciFunc(int num) {
        if (arr[num] == -1) {
            arr[num] = fibonacciFunc(num - 1) + fibonacciFunc(num - 2);
        }
        return arr[num];
    }
}
