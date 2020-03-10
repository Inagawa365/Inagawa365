package vrietyArray;

import java.util.ArrayList;

public class task1 {

    public static void main(String[] args) {
        ArrayList<String> Placename = new ArrayList<>();

        Placename.add("北海道");
        Placename.add("東北");
        Placename.add("関東");
        Placename.add("中部");
        Placename.add("近畿");
        Placename.add("中国");
        Placename.add("九州");

        for(String chimei : Placename){
            System.out.println(chimei);
        }
    }
}
