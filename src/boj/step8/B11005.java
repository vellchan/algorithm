package boj.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11005 {
    static int N;
    static int B;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        List<Character> list = new ArrayList<>();
        while (N>0) {
            if (N%B<10) {
                list.add((char)(N%B+'0'));
            } else {
                list.add((char)(N%B-10+'A'));
            }

            N /= B;
        }

        for (int i=list.size()-1;i>=0;i--) {
            System.out.print(list.get(i));
        }
    }
}
