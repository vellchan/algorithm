package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1524 {
    static int T;
    static int M;
    static int N;
    static ArrayList<Integer> sPower;
    static ArrayList<Integer> bPower;
    static ArrayList<ArrayList<Integer>> sPowerList;
    static ArrayList<ArrayList<Integer>> bPowerList;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        T = Integer.parseInt(st.nextToken());
        sPowerList = new ArrayList<ArrayList<Integer>>();
        bPowerList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<T; i++){
            String temp = br.readLine();

            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            sPower = new ArrayList<Integer>();
            bPower = new ArrayList<Integer>();
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<N; j++){
                sPower.add(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<M; j++){
                bPower.add(Integer.parseInt(st.nextToken()));
            }

            sPowerList.add(sPower);
            sPowerList.add(bPower);
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for(int i=0; i<T; i++){





        }
    }
}
