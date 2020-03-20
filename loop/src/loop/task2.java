package loop;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        System.out.print("数字を入力してください: "); //入力を受付
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int sum = 1;

        System.out.println(sum);

        for(int i = 1; i <= numA; i++) {
            sum += i;
            System.out.print("+" + i);
        }
        System.out.println("=" + sum);
    }
}
