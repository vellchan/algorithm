package boj.step6;

public class B4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[101];
        for(int i=1;i<101;i++){
            int n = d(i);
            if(n<101){
                arr[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<101;i++){
            if(!arr[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int i){
        int sum = i;

        while(i != 0){
            sum = sum+(i%10);
            i = i/10;
        }
        return sum;

    }
}
