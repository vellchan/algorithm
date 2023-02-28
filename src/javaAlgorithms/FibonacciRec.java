package javaAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FibonacciRec {
    static int N;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        fibonacci(0);
        System.out.println(sb.toString());
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
    }

    static void fibonacci(int num) {
        if(num == N+1) {
            for (int i=0; i<=N; i++) {
                sb.append("fibonacci("+i+"):"+arr[i]).append("\n");
            }
            sb.append("\n");
        } else if(num <= 1) {
            arr[num] = num;
            fibonacci(num+1);
        } else {
            arr[num] = arr[num-2] + arr[num-1];
            fibonacci(num+1);
        }
    }
}
