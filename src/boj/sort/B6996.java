package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B6996 {
    static int N;

    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            String[] strArr = new String[2];
            st = new StringTokenizer(br.readLine(), " ");
            strArr[0] = st.nextToken();
            strArr[1] = st.nextToken();

            char[] chars1 = strArr[0].toCharArray();
            char[] chars2 = strArr[1].toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            if(new String(chars1).equals(new String(chars2))) {
                System.out.println(strArr[0]+" & "+strArr[1]+" are anagrams.");
            }else {
                System.out.println(strArr[0]+" & "+strArr[1]+" are NOT anagrams.");
            }



        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
