package loop;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        System.out.print("数字を入力してください: "); //入力を受付
        Scanner sc = new Scanner(System.in);

        long lo = sc.nextLong();

        int keta = 0;
        while(lo > 0) {
            keta ++;
            lo = lo / 10;
        }
        System.out.println("桁数:" + keta);
    }
}
