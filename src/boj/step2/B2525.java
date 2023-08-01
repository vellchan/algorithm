package boj.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2525 {
    static int HH;
    static int MM;
    static int needMM;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HH = Integer.parseInt(st.nextToken());
        MM = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), "");
        needMM = Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
    static void solution() {
        if(needMM + MM >= 60) {
            HH += (needMM + MM)/60;
            MM = (needMM + MM)%60;
        }else {
            MM += needMM;
        }
        if (HH >= 24) {
            HH -= 24;
        }
        System.out.println(HH+" "+MM);
    }
}
