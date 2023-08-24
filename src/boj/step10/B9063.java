package boj.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9063 {
    static int N;
    static int xMax;
    static int xMin;
    static int yMax;
    static int yMin;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());

        xMax = -10000;
        xMin = 10000;
        yMax = -10000;
        yMin = 10000;

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (xMax < x) {
                xMax = x;
            }
            if (xMin > x) {
                xMin = x;
            }

            if (yMax < y) {
                yMax = y;
            }
            if (yMin > y) {
                yMin = y;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        System.out.println((xMax-xMin)*(yMax-yMin));
    }
}
