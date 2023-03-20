package boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14913 {
    static int a;
    static int d;
    static int k;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());

        d = Integer.parseInt(st.nextToken());

        k = Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
    static void solution() {
        int cnt = 1;
        boolean flag = true;
        while (a != k) {
            a += d;
            if (d > 0) {
                if (a > k) {
                    flag = false;
                    break;
                }
            } else {
                if (a < k) {
                    flag = false;
                    break;
                }
            }
            cnt++;
        }
        if (flag) {
            System.out.println(cnt);
        } else {
            System.out.println("X");
        }
    }
}
