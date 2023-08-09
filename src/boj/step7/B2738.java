package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {
    static int N;
    static int M;
    static int[][] aArr;
    static int[][] bArr;
    static int[][] resultArr;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        aArr = new int[N][M];
        bArr = new int[N][M];
        resultArr = new int[N][M];

        for (int i=0; i<aArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<aArr[i].length; j++) {
                aArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<bArr.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<bArr[i].length; j++) {
                bArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i=0; i<resultArr.length; i++) {
            for (int j=0; j<resultArr[i].length; j++) {
                resultArr[i][j] = aArr[i][j] + bArr[i][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for (int i=0; i<resultArr.length; i++) {
            for (int j=0; j<resultArr[i].length; j++) {
                System.out.print(resultArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
