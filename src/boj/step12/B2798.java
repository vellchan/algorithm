package boj.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
    static int[] arr;
    static int M;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[Integer.parseInt(st.nextToken())];
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int sum = 0;
        for (int i=0; i<arr.length-2; i++) {
            if (arr[i] >= M) continue;
            for (int j=i+1; j<arr.length-1; j++) {
                if (arr[i]+arr[j] >= M) continue;
                for (int k=j+1; k<arr.length; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (temp <= M && temp >= sum) {
                        sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
