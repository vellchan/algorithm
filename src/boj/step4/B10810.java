package boj.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810 {
    static int[] arr;
    static int M;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[Integer.parseInt(st.nextToken())+1];

        M = Integer.parseInt(st.nextToken());
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startJ = Integer.parseInt(st.nextToken());
            int endJ = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int j = startJ; j<=endJ; j++) {
                arr[j] = k;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        input();
        solution();
    }
    static void solution() {
        for (int i=1; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length) System.out.print(" ");
        }
    }
}
