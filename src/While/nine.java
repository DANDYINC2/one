package While;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int numb = 0;
        if (n < 1000) {
            for (int i = n; i < 1000; i++) {
                if (check(i)) {
                    numb = i;
                    break;
                }
            }
            System.out.println(numb);
        }
    }

    public static boolean check(int numb) {
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}

