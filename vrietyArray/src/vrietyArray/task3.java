package vrietyArray;

import java.util.HashMap;

public class task3 {

    public static void main(String[] args) {

        HashMap<String, Integer> fruit = new HashMap<>();

        fruit.put("りんご", 130);
        fruit.put("みかん", 120);
        fruit.put("バナナ", 98);
        fruit.put("メロン", 6000);

        for (String key :fruit.keySet()){
            int value = fruit.get(key);
            System.out.println(key + ":" + value + "円");
        }
    }
}
