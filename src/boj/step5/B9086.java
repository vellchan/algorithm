package boj.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9086 {
    static int T;
    static String[] sArr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        T = Integer.parseInt(st.nextToken());

        sArr = new String[T];
        for (int i=0; i<sArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sArr[i] = st.nextToken();
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for (int i=0; i<sArr.length; i++) {
            System.out.print((sArr[i].charAt(0)+"")+(sArr[i].charAt(sArr[i].length()-1)+""));
            System.out.println();
        }
    }
}
