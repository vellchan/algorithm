package boj.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11651 {
    static int[][] arr;
    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];
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

    private static void solution() {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] != o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                sb.append(arr[i][j]);
                if (j==0) {
                    sb.append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
