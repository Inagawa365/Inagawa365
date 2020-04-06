package loop;

public class task5 {

    public static void main(String[] args) {

        for(int i = 1; i <= 9; i ++){
            for(int j = 1; j <= 9; j ++){
                int a = i * j; //aに乗算結果を代入
                System.out.print(" "); //空白を出力
                if(a < 10) {
                System.out.print(" "); //結果が10以下の時、空白を追加
                }
                System.out.print(a); //乗算結果を表示
            }
            System.out.println(""); //改行を出力
        }
    }
}
