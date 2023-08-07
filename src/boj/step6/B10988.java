package boj.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10988 {
    static int N;
    static String[] strArr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        strArr = new String[N];

        for (int i=0; i<strArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            strArr[i] = st.nextToken();
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int cnt = 0;
        for (int i=0; i<strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            boolean check = true;
            sb.append(strArr[i].charAt(0)+"");
            for (int j=1; j<strArr[i].length(); j++) {
                if (strArr[i].charAt(j-1) != strArr[i].charAt(j)) {
                    if (sb.indexOf(strArr[i].charAt(j)+"") == -1) {
                        sb.append(strArr[i].charAt(j)+"");
                        check = true;
                    }else {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
