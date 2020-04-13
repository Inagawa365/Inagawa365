package loop;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("数字を入力してください: "); //入力を受付
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= numA; i ++) {
            sum += i;
            System.out.print(i);
            if(i < numA) {
                System.out.print(" + "); //numA前までの数字に"+"を表示
            }
        }
        sc.close();
        System.out.println(" = " + sum);
    }
}
