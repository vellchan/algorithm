package boj.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10926 {
    static String str;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        str = st.nextToken();
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
    static void solution() {
        System.out.println(str+"??!");
    }
}
