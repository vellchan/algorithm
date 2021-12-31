package boj.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float[] arr = new float[Integer.parseInt(br.readLine())];
        float[] arr1 = new float[arr.length];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        float sum = 0;
        float max = 0;

        for(int i=0; i<arr.length;i++){
            arr[i]=Float.parseFloat(st.nextToken());
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length;i++){
            arr1[i] = (arr[i]/max)*100;
            sum += arr1[i];
        }


        System.out.println(sum/arr.length);

    }
}
