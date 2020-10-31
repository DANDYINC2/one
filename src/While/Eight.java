package While;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int c =10;


        while(x!=0){

            if((x%10)%2!=0 ) {
                if (x%10<c) {
                    c = x%10;
                    x/=10;

                }
                else{
                    break;


                }

            }
            else{

                x/=10;

            }


        }
        if (c==10) {
            System.out.println("NO");
        }
        else{
            System.out.println(c);
        }
    }
}
