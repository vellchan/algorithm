package boj.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B25304 {
    static int X;
    static int N;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            X -= (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

    }
    public static void main(String[] args) throws IOException{
        input();
        solution();
    }
    static void solution() {
        if (X == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
