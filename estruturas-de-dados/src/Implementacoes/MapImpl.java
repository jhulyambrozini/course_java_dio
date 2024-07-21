package Implementacoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class MapImpl {
    public static void main(String[] args) {
        Map<String, String> map  = new HashMap<>();

        map.put("Nome", "Joao");
        map.put("idade", "12");
        map.put("turma", "3B");

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());

        List<Map<String, String>> listMap = new ArrayList<>();

        Map<String, String> map2  = new HashMap<>();

        map2.put("Nome", "Maria");
        map2.put("idade", "10");
        map2.put("turma", "1A");

        listMap.add(map);
        listMap.add(map2);

        System.out.println("=====================");

        System.out.println(listMap);


    }
}
