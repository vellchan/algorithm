package boj.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11382 {
    static long[] arr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new long[3];
        for(int i=0; i<3; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
    static void solution() {
        System.out.println(Arrays.stream(arr).sum());
    }
}
