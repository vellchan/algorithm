package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B27522 {
    static String[][] recordArr;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        recordArr = new String[8][2];
        for (int i=0; i<8; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String record = st.nextToken();
            int recordToInt = Integer.parseInt(record.substring(0,1))*60000+Integer.parseInt(record.substring(2,4))*1000+Integer.parseInt(record.substring(5,8));
            recordArr[i][0] = Integer.toString(recordToInt);//Integer.toString(recordToInt);
            recordArr[i][1] = st.nextToken();
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(recordArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        int score = 10;
        int rScore = 0;
        int bScore = 0;
        for (int i=0; i<8; i++) {
            if(recordArr[i][1].equals("R")) {
                rScore += score;
            }else {
                bScore += score;
            }
            if(i<2) {
                score -= 2;
            }else {
                score--;
            }
        }
        System.out.println(rScore+"  "+bScore);
        if(rScore > bScore) {
            System.out.println("Red");
        } else if(rScore < bScore) {
            System.out.println("Blue");
        } else {
            if(recordArr[0][1].equals("R")){
                System.out.println("Red");
            } else {
                System.out.println("Blue");
            }
        }
    }
}
