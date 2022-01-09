package boj.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int room = n;
        int line=1;
        while(room > 0){
            room-=line;
            line++;
        }

        if((line-1)%2==0){
            int numerator=1;
            int denominator=line-1;
            for(int i=1;i<(line-1);i++){
                n-=i;
            }
            for(int j=1;j<n;j++){
                numerator++;
                denominator--;
            }
            System.out.println(numerator+"/"+denominator);
        }else if((line-1)%2==1){
            int numerator = line-1;
            int denominator = 1;
            for(int i=1;i<(line-1);i++){
                n-=i;
            }
            for(int j=1;j<n;j++){
                numerator--;
                denominator++;
            }
            System.out.println(numerator+"/"+denominator);
        }
    }
}
