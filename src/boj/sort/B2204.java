package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2204 {
    static int N;
    static String[] arr;
    static ArrayList<String[]> list;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<String[]>();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            if (N != 0) {
                arr = new String[N];

                for (int i=0; i<N; i++) {
                    st = new StringTokenizer(br.readLine(), " ");
                    arr[i] = st.nextToken();
                }
                list.add(arr);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for(int i=0; i<list.size(); i++){
            Arrays.sort(list.get(i), new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.toUpperCase().compareTo(o2.toUpperCase());
                }
            });
            System.out.println(list.get(i)[0]);
        }
    }
}
