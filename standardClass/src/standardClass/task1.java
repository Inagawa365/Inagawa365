package standardClass;

public class task1 {

    public static void main(String[] args) {

        String str1 = " tech-compass ";
        String str2 = str1.trim(); //文字列の先頭・末尾の空白を削除

        System.out.println("変換前:" + str1);
        System.out.println("変換後:" + str2.toUpperCase());  //文字列を大文字にする
    }
}
