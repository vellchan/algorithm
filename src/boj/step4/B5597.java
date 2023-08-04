package boj.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5597 {
    static int[] arr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        arr = new int[30];


        for (int idx=0; idx<28; idx++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[Integer.parseInt(st.nextToken())-1] = 1;
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();

    }

    static void solution() {
        int[] result = new int[2];
        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != 1) {
                result[cnt] = i+1;
                cnt++;
            }
        }

        Arrays.sort(result);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
