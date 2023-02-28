package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2587 {
    static int[] arr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
           sum += arr[i];
        }
        System.out.println(sum/arr.length);
        System.out.println(arr[2]);



    }
}
