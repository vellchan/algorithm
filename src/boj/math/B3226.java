package boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B3226 {
    static int N;
    static Map<String, String> map;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());

        map = new HashMap<String, String>();
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            map.put(st.nextToken(), st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int sum = 0;
        for (String key : map.keySet()) {
            int HH = Integer.parseInt(key.substring(0, key.indexOf(":")));
            int MM = Integer.parseInt(key.substring(key.indexOf(":")));
            int DD = Integer.parseInt(map.get(key));
        }
    }
}
