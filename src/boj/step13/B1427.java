package boj.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B1427 {
    static ArrayList<Integer> list;
    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = st.nextToken();
        list = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            list.add(Integer.valueOf(String.valueOf(str.charAt(i))));
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    private static void solution() {
        Collections.sort(list);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (int j : list) {
            sb.append(j);
        }

        System.out.println(sb);
    }
}
