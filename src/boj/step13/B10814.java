package boj.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B10814 {
    static String[][] sArr;
    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        sArr = new String[Integer.parseInt(st.nextToken())][2];

        for (int i=0; i<sArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<sArr[i].length; j++) {
                sArr[i][j] = st.nextToken();
            }
        }

    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    private static void solution() {
        Arrays.sort(sArr, new Comparator<String[]>() {
                    @Override
                    public int compare(String[] o1, String[] o2) {
                        int a = Integer.parseInt(o1[0]);
                        int b = Integer.parseInt(o2[0]);
                        return a-b;
                    }
                });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<sArr.length; i++) {
            for (int j=0; j<sArr[i].length; j++) {
                sb.append(sArr[i][j]);
                if (j==0) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

}
