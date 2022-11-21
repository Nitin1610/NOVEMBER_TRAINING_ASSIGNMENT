package com.yash.stringexc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exc4 {

	public static void main(String[] args) {
        getCountOfCharacters();
    }

    public static void getCountOfCharacters() {
        Map<Character,Integer> map = new LinkedHashMap<>();
        String input = "nitin";
        for (int i =0 ; i<input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {

                int count = map.get(input.charAt(i));
                map.put(input.charAt(i), ++count);
            } else {
                map.put(input.charAt(i),1);
            }
        }
        System.out.println("map : "+map);
    }
}
