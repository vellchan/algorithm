package boj.step5;

import java.util.ArrayList;
import java.util.Scanner;
/*HashSet, Collection 종류에 대해서 공부하기*/

public class B3052_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            int a = sc.nextInt()%42;
            if(arrayList.indexOf(a) < 0){
                arrayList.add(a);
            }
        }
        System.out.println(arrayList.size());
    }
}
