package boj.step3;

import java.io.*;


public class B2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=N;i>0;i--){
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();


    }

}
