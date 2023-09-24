package boj.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
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
        int constructor = 0;

        for (int i=N; i>0; i--) {
            int temp = i;

            String[] arr = String.valueOf(temp).split("");
            for (int j=0; j<arr.length; j++) {
                temp += Integer.parseInt(arr[j]);
                if (temp > N) continue;
            }

            if (temp == N) constructor = i;
        }

        System.out.println(constructor);
    }
}
