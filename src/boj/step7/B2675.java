package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<testCase;i++){
            st = new StringTokenizer(br.readLine()," ");
            int length = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0;j<str.length();j++){
                for(int k=0;k<length;k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
