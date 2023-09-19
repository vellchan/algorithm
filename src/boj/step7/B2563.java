package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* 다시 풀어보기
* */
public class B2563 {
    static int N;
    static boolean[][] arr;
    static int total;
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        arr = new boolean[101][101];
        total = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }

        System.out.println(total);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
