package boj.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    static Boolean[][] arr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new Boolean[N][M];

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<M; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int minCount = 64;
        for (int i = 0; i < arr.length - 7; i++) {
            for (int j = 0; j < arr[i].length - 7; j++) {
                int count = 0;
                Boolean start = arr[i][j];
                for (int k = i; k < i+8; k++) {
                    for (int m = j; m < j+8; m++) {
                        if (arr[k][m] != start) {
                            count++;
                        }
                        start = !start;
                    }
                    start = !start;
                }
                count = Math.min(count, 64 - count);
                minCount = Math.min(minCount, count);
            }
        }

        System.out.println(minCount);
    }
}
