package boj.step4;

import javax.xml.stream.StreamFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807 {
    static int N;
    static int[] arr;
    static int v;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        v = Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException{
        input();
        solution();
    }
    static void solution() {
        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] == v) cnt++;
        }

        System.out.println(cnt);
    }
}
