package While;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d =2;

        if(n==1){
            System.out.println(3);

        }
        else{
            while (n>=d*d){
                if(n%d==0){
                   d++;
                   continue;
                }
                else{
                }

            }

        }

    }
}
