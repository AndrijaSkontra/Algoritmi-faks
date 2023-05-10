package predavanja.predavanja3_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3 {

    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "deset");
        mapa.put(30, "tricet");
        mapa.put(21, "sometihng");
        mapa.put(90, "puno");
        mapa.put(43, "deset");
        System.out.println(mapa);
        System.out.println("\n----------------------------------------------------------------\n");
        printMapElem(mapa);
        System.out.println("______________________++++++++++++++++++");
        System.out.println(findKeys(mapa, "deset"));


    }

    private static <K, V> void printMapElem(HashMap<K, V> mapa) {
        for(K key : mapa.keySet()) {
            System.out.println(key);
        }
        for(V value : mapa.values()) {
            System.out.println(value);
        }
    }

    private static <K, V> TreeSet<K> findKeys(HashMap<K, V> map, V value) {
        TreeSet<K> keys = new TreeSet<>();
        for (K key : map.keySet()) {
            if (map.get(key).equals(value)) {
                keys.add(key);
            }
        }
        return keys;
    }
}
