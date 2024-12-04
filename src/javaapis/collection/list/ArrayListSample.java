package javaapis.collection.list;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("アイスランド");
        a1.add("スペイン");
        a1.add("ナポリ");
        a1.add("リスボン");
        a1.add("ヨセミテ国立公園");

        String place=a1.get(2);
        System.out.println(place);

        int listCount=a1.size();
        System.out.println(listCount);

        a1.remove(2);
        place=a1.get(2);
        System.out.println(place);

        System.out.println("ループここから");

        for(String nation : a1) {
            System.out.println(nation);
        }

    }

}
