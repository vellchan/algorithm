package boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25314 {
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
        String str = "";
        for (int i=0; i<N/4; i++) {
            str += "long ";
        }
        str += "int";
        System.out.println(str);
    }
}
