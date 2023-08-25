package boj.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B10101 {
    static int A;
    static int B;
    static int C;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        if ((A + B + C) != 180) {
            System.out.println("Error");
        } else if (A == B && B == C) {
            System.out.println("Equilateral");
        } else if (A == B || B == C || A == C) {
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene");
        }
    }
}
