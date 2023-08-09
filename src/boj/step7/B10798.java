package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10798 {
    static String[][] sArr;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        sArr = new String[5][15];
        for (int i=0; i<sArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            for (int j=0; j<sArr[i].length; j++) {
                if (str.length() > j) {
                    sArr[i][j] = str.charAt(j)+"";
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<15; i++) {
            for (int j=0;j<sArr.length; j++) {
                if (sArr[j][i] != null && !"".equals(sArr[j][i])) sb.append(sArr[j][i]);
            }
        }
        System.out.println(sb.toString());
    }

}