package boj.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
    static int N;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int count = 1;
        int num = 666;
        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.println(num);
    }
}
