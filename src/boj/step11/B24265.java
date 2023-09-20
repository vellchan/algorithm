package boj.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24265 {
    static long n;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Long.parseLong(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        System.out.println(n*(n/2));
        System.out.println(2);
    }
}
