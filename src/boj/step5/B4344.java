package boj.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int c = Integer.parseInt(br.readLine());

        for(int i=0; i<c;i++){
            double cnt =0;
            st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[Integer.parseInt(st.nextToken())];

            double sum =0;
            for(int j=0;j<arr.length;j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double avg = (sum/arr.length);
            for(int k=0;k<arr.length;k++){
                if(avg<arr[k]){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/arr.length)*100);
        }
    }
}
