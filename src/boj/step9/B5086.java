package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5086 {
    static int i;
    static int j;

    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        i = Integer.parseInt(st.nextToken());
        j = Integer.parseInt(st.nextToken());
        while (i != 0 && j != 0) {
            if (j%i == 0) {
                System.out.println("factor");
            } else if (i%j == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
