package boj.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    static Double ratingChangeScore(String grade) {
        switch (grade) {
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            case "F" : return 0.0;
            default: return null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double totalSum = 0;
        double gradeSum = 0;
        for (int i=0; i<20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String rating = st.nextToken();
            if (!rating.equals("P")) {
                gradeSum += grade;
                double score = ratingChangeScore(rating);
                totalSum += (grade * score);
            }
        }
        System.out.println(totalSum/gradeSum);
    }
}
