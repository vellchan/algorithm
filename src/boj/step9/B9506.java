package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9506 {
    static int n;

    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());

        while (n != -1) {
            int sum = 0;
            for (int i=1; i<n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.print(n+" = ");
                for (int i=1; i<n; i++) {
                    if (n%i == 0) {
                        System.out.print(i);
                        if (i < n/2) {
                            System.out.print(" + ");
                        }
                    }
                }
            } else {
                System.out.print(n +" is NOT perfect.");
            }
            System.out.println();
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
