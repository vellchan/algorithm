package boj.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2480 {
    static int[] arr = new int[3];

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException{
        input();
        solution();
    }
    static void solution() {
        if (arr[0] == arr[1] && arr[0] == arr[2]) {
            System.out.println(10000+arr[0]*1000);
        }else if (arr[0] == arr[1] || arr[0] == arr[2]) {
            System.out.println(1000+arr[0]*100);
        }else if (arr[1] == arr[2]) {
            System.out.println(1000+arr[1]*100);
        }else {
            Arrays.sort(arr);
            System.out.println(arr[2]*100);
        }

    }
}
