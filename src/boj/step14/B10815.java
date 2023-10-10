package boj.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10815 {
    static int N;
    static int[] nArr;
    static int M;
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        nArr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<nArr.length; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nArr);

        st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<M; i++) {
            sb.append(binarySearch(nArr, Integer.parseInt(st.nextToken())));
            sb.append(" ");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int[] nArr, int search) {
        int first = 0;
        int last = N-1;
        int mid = 0;
        while (first <= last) {
            mid = (first+last)/2;
            if (nArr[mid] == search) {
                return 1;
            }
            if (nArr[mid] < search) {
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
