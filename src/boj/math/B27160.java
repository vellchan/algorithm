package boj.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B27160 {
    static Map<String,Integer> map;
    static int N;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        map = new HashMap<String, Integer>();
        for (int i=0; i<N; i++) {
             st = new StringTokenizer(br.readLine(), " ");
             String fruit = st.nextToken();
             if(map.containsKey(fruit)) {
                 map.put(fruit, map.get(fruit)+Integer.valueOf(st.nextToken()));
             } else {
                 map.put(fruit, Integer.valueOf(st.nextToken()));
             }
        }

    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
    static void solution() {
        boolean flag = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 5) {
                flag = true;
                System.out.println("YES");
                break;
            }
        }

        if (!flag) {
            System.out.println("NO");
        }
    }
}
