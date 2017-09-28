package com.mihk.chapter03;

import com.mihk.utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Hello {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        CollectionUtil u = new CollectionUtil();
        System.out.println(u.fomatList(list));
        System.out.println(u.fomatList(list, "--->"));
        System.out.println(u.fomatList(list, "<", ">"));
        System.out.println(u.fomatList(list, "{", "}", "***"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Util.join2String());
        System.out.println(Util.join2String(list));
        System.out.println(Util.join2String(list, "--->"));
        System.out.println(Util.join2String(list, "<", ">"));
        System.out.println(Util.join2String(list, "{", "}", "***"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Util.j2s(list));
        System.out.println(Util.j2s(list, "--->"));
        System.out.println(Util.j2s(list, "<", ">"));
        System.out.println(Util.j2s(list, "{", "}", "***"));

        System.out.println(Util.lastChar("hello"));
        System.out.println(Util.getLast("Hello"));
        StringBuffer buffer = new StringBuffer().append("1").append("2").append(3);
        System.out.println(Util.getLast(buffer));
        String str = "12.345-6.A";
        System.out.println(str.split("\\.")[1]);
    }
}
