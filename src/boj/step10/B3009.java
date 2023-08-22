package boj.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B3009 {
    static List<Integer> xList;
    static List<Integer> yList;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        xList = new ArrayList<Integer>();
        yList = new ArrayList<Integer>();

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xList.add(Integer.parseInt(st.nextToken()));
            yList.add(Integer.parseInt(st.nextToken()));
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        int xPoint = -1;
        int yPoint = -1;
        for (int i=0; i<3; i++) {
            if(Collections.frequency(xList, xList.get(i)) == 1) {
                xPoint = xList.get(i);
            }

            if(Collections.frequency(yList, yList.get(i)) == 1) {
                yPoint = yList.get(i);
            }
        }

        System.out.println(xPoint+" "+yPoint);
    }
}