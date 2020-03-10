package branch;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //if-else文
        if(a > 1) {
            System.out.print("入力された数字は正の数です。");
        }else if(a < -1) {
            System.out.print("入力された数字は負の数です。");
        }else if(a == 0){
            System.out.print("入力された数字は0です。");
        }
    }
}