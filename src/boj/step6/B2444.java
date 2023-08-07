package boj.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2444 {
    static int N;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for (int i=0; i<N; i++) {
            for (int j=0; j<N-i-1; j++) {
                System.out.print(" ");
            }
            for (int k=0;k<(2*i+1);k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=N-1; i>0; i--) {
            for (int j=0; j<N-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<(2*(i-1)+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
