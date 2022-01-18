package boj.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        if(w-x>=x){
            if(h-y<=y&&h-y<=x){
                System.out.println(h-y);
            }else if(h-y>=y&&y<=x){
                System.out.println(y);
            }else {
                System.out.println(x);
            }
        }else{
            if(h-y<=y&&h-y<=w-x){
                System.out.println(h-y);
            }else if(h-y>=y&&y<=w-x){
                System.out.println(y);
            }else {
                System.out.println(w-x);
            }
        }

    }
}
