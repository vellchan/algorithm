package boj.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2720 {
    static int T;
    static int[][] arr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        T = Integer.parseInt(st.nextToken());
        arr = new int[T][4];
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int C = Integer.parseInt(st.nextToken());
            while (C > 0) {
                if (C >= 25) {
                    C -= 25;
                    arr[i][0]++;
                } else if (C >= 10) {
                    C -= 10;
                    arr[i][1]++;
                } else if (C >= 5) {
                    C -= 5;
                    arr[i][2]++;
                } else {
                    C -= 1;
                    arr[i][3]++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
