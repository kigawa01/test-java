package net.kigawa.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        final String letter = "tarou zirou tarou saburou sirou";
        var list = new LinkedList<String>();
        Collections.addAll(list, letter.split(" "));

        var resultMap = new HashMap<String, Integer>();
        for (var str : list) {
            int count = resultMap.getOrDefault(str, 0);
            count++;
            resultMap.put(str, count);
        }

        System.out.println(resultMap);
    }
}