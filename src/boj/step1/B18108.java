package boj.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18108 {
    static int y;
    static final int k = 2541-1998;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        y = Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
    static void solution() {
        System.out.println(y-k);
    }
}
