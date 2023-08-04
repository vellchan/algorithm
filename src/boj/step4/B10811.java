package boj.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10811 {
    static int[] arr;
    static int M;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[Integer.parseInt(st.nextToken())];
        M = Integer.parseInt(st.nextToken());

        for (int idx=0; idx<arr.length; idx++) {
            arr[idx] = idx+1;
        }

        for (int idx=0;idx<M; idx++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            reverse(i-1, j);
        }

    }

    static void reverse(int start, int end) {
        int[]copyArr = Arrays.copyOfRange(arr, start, end);
        int length = copyArr.length;
        for(int i=0; i<length; i++) {
            arr[start+i]= copyArr[length-i-1];
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();

    }

    static void solution() {
        for (int idx=0; idx<arr.length; idx++) {
            System.out.print(arr[idx]+" ");
        }
    }

}