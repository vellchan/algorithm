package boj.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B27866 {
    static String S;
    static int i;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        S = st.nextToken();
        st = new StringTokenizer(br.readLine(), " ");
        i = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        System.out.println(S.charAt(i-1));
    }
}
