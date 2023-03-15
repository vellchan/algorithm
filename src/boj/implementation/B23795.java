package boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B23795 {
    static int sum;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        sum = 0;
        while (n != -1) {
            sum += n;
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sum);
    }
}
