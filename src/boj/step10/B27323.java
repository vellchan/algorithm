package boj.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B27323 {
    static int A;
    static int B;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        B = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        System.out.println(A*B);
    }
}
