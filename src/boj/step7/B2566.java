package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {
    static int[][] arr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        arr = new int[9][9];

        for (int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int max = -1;
        int row = -1;
        int column = -1;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row+" "+column);
    }
}
