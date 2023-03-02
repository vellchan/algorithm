package boj.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B1271 {

    static BigInteger N;
    static BigInteger M;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = new BigInteger(st.nextToken());
        M = new BigInteger(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        System.out.println(N.divide(M));
        System.out.println(N.remainder(M));
    }


}
