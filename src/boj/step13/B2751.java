package boj.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2751 {
    static int N;
    static ArrayList<Integer> list;
    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(Integer.parseInt(st.nextToken()));
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    private static void solution() {
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int j : list) {
            sb.append(j).append('\n');
        }

        System.out.println(sb);
    }
}
