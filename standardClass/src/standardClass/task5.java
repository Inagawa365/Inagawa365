package standardClass;

public class task5 {

    public static void main(String[] args) {

        String text = "cat_mouse_mouse_cat_cat";
        String[] sp = text.split("_"); //'_'で文字列を区切る

        int x = 0;
        int y = 0;

        for(String aaa : sp){
            if(aaa.equals("cat")){
                x++;	//配列中のcatの回数をカウント
            }
        }
        for(String bbb : sp){
            if(bbb.equals("mouse")){
                y++;	//配列中のmouseの回数をカウント
            }
        }
        if(x > y){
            System.out.println("catの方が多い");
        }else{
            System.out.println("mouseの方が多い");
        }
    }
}
