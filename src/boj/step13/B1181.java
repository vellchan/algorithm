package boj.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1181 {
    static String[] sArr;
    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        sArr = new String[Integer.parseInt(st.nextToken())];

        for (int i=0; i<sArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sArr[i] = st.nextToken();
        }

    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    private static void solution() {
        Arrays.sort(sArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(sArr[0]).append('\n');
        for (int i=1; i<sArr.length; i++) {
            if (!sArr[i].equals(sArr[i-1])) {
                sb.append(sArr[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
