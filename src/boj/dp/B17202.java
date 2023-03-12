package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class B17202 {
    static Integer[] arr;
    static List<Integer> list;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new Integer[16];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String aPhone = st.nextToken();

        for(int i=0; i<8; i++){
            arr[i*2]=aPhone.charAt(i)-'0';
        }

        st = new StringTokenizer(br.readLine(), " ");
        String bPhone = st.nextToken();

        for(int i=0; i<8; i++){
            arr[i*2+1]=bPhone.charAt(i)-'0';
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution(arr);
        System.out.println(list.get(0)+""+list.get(1));
    }

    static void solution(Integer[] arr) {
        list = Arrays.asList(arr);
        while (list.size() > 2) {
            List<Integer> result = new ArrayList<>();
            for (int i=0; i<list.size()-1; i++) {
                result.add((list.get(i)+list.get(i+1))%10);
            }
            list = result;
        }
    }
}
