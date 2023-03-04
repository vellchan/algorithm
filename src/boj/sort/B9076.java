package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B9076 {
    static ArrayList<Integer[]> list;
    static int tCnt;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        tCnt = Integer.parseInt(st.nextToken());
        list = new ArrayList<Integer[]>();
        for (int i=0; i<tCnt; i++) {
            Integer[] arr = new Integer[5];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<5; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            list.add(arr);
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }

    static void solution() {
        for (int i=0; i<tCnt; i++) {
             Arrays.sort(list.get(i), new Comparator<Integer>() {
                 @Override
                 public int compare(Integer o1, Integer o2) {
                     return o2-o1;
                 }
             });
             if(list.get(i)[1]-list.get(i)[3] >= 4) {
                 System.out.println("KIN");
             }else {
                 System.out.println(list.get(i)[1]+list.get(i)[2]+list.get(i)[3]);
             }
        }
    }
}
