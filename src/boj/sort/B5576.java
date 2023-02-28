package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B5576 {
    static Integer[] wScores;
    static Integer[] kScores;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        wScores = new Integer[10];
        kScores = new Integer[10];
        for(int i=0; i<wScores.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            wScores[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<kScores.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            kScores[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(wScores, Collections.reverseOrder());
        Arrays.sort(kScores, Collections.reverseOrder());
        int wScoreSum = 0;
        int kScoreSum = 0;

        for(int i=0; i<3; i++) {
            wScoreSum += wScores[i];
        }
        for(int i=0; i<3; i++) {
            kScoreSum += kScores[i];
        }
        System.out.println(wScoreSum+" "+kScoreSum);
    }
}
