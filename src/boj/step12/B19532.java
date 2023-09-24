package boj.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B19532 {
    static int[] arr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[6];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for (int x=-999; x<=999; x++) {
            for (int y=-999; y<=999; y++) {
                if (arr[0]*x+arr[1]*y==arr[2] && arr[3]*x+arr[4]*y==arr[5]) {
                    System.out.println(x+" "+y);
                }
            }
        }
    }
}
