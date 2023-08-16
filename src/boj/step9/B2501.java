package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2501 {
    static int N;
    static int K;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int cnt = 0;
        for (int i=1; i<=N; i++) {
            if (N%i == 0) {
                cnt++;
                if (cnt == K) {
                    System.out.println(i);
                    break;
                }
            }
        }

        if (cnt < K) {
            System.out.println(0);
        }
    }
}
