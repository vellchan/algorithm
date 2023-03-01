package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1296 {
    static String   yeonDooName;
    static String[] teamNames;
    static int L = 0;
    static int O = 0;
    static int V = 0;
    static int E = 0;
    static int maxPer;
    static String maxPerTeamName;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        yeonDooName = st.nextToken();
        st = new StringTokenizer(br.readLine(), " ");
        teamNames = new String[Integer.parseInt(st.nextToken())];
        for (int i=0; i<teamNames.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            teamNames[i] = st.nextToken();
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();

        System.out.println(maxPerTeamName);
    }

    private static void solution() {
        maxPer = 0;

        for (int i=0; i<teamNames.length; i++) {
            if(i == 0){
                maxPerTeamName = teamNames[i];
            }
            for(int k=0; k<yeonDooName.length(); k++){
                checkCnt(yeonDooName.charAt(k));
            }
            for (int j = 0; j < teamNames[i].length(); j++) {
                checkCnt(teamNames[i].charAt(j));
            }
            int curPer = ((L + O)*(L + V)*(L + E)*(O + V)*(O + E)*(V + E)) % 100;
            if (curPer > maxPer) {
                maxPer = curPer;
                maxPerTeamName = teamNames[i];
            } else if (curPer == maxPer) {
                if(maxPerTeamName.compareTo(teamNames[i]) > 0) {
                    maxPer = curPer;
                    maxPerTeamName = teamNames[i];
                }
            }
            L = 0;
            O = 0;
            V = 0;
            E = 0;
        }
    }

    static void checkCnt(char c) {
        switch (c) {
            case 'L' :
                L++;
                break;
            case 'O' :
                O++;
                break;
            case 'V' :
                V++;
                break;
            case 'E' :
                E++;
                break;
            default:
                break;
        }
    }
}
