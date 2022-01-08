package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt=0;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (i < str.length() - 1) {
                if (c == 'c') {
                    if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                        i++;
                    }
                } else if (c == 'd') {
                    if (str.charAt(i + 1) == '-') {
                        i++;
                    } else if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
                        if(str.charAt(i + 2)=='='){
                            i += 2;
                        }
                    }
                } else if (c == 'l' || c == 'n') {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                } else if (c == 's' || c == 'z') {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            cnt++;
        }
        System.out.println(cnt);

    }
}

