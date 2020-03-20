package standardClass;

public class task1 {

    public static void main(String[] args) {

        String str1 = " tech-compass ";
        String str2 = str1.toUpperCase().trim(); //文字列を大文字に変換し、前後空白を削除する

        System.out.println("変換前:" + str1);
        System.out.println("変換後:" + str2);
    }
}
