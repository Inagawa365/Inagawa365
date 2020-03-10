package branch;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        //二つの値をそれぞれ入力する
        Scanner sc = new Scanner(System.in);
        System.out.print("numA: ");
        int numA = sc.nextInt();
        System.out.print("numB: ");
        int numB = sc.nextInt();

        //if-else if-else文

        //条件1 正の整数であるか
        if(numA <= 0 || numB <= 0){
            System.out.print("正の整数を入力してください");

        //条件2 numBはnumAの約数であるか
        }else if(numA % numB == 0) {
            System.out.print("numBはnumAの約数です");
        }else{
            System.out.print("numBはnumAの約数ではありません");
        }
    }
}
