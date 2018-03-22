package com.rename.test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) throws ParseException {

        Byte b1 = null;
        Byte b2 = 1;
        int q = b1;
        System.out.println(q);

        System.out.println(b2.equals(b1.intValue()));

        System.out.println(Math.ceil(0 / 3.0));

        Long a = null;

//        long b = a;
//        System.out.println(b);
        int c = 1;
        c = Math.max(c + 1, 0);
        System.out.println(c);

//        List<String> list = Arrays.asList("a", "b");
//        list.stream().map(x -> x + x).forEach(System.out::println);
//        list.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
//
//        Callable<Integer> a = () -> 2;

//        List<As> list1 = new ArrayList<>();
//        As as1 = new As();
//        as1.a = "1";
//        as1.s = 1;
//        list1.add(as1);
//        List<As> list2 = new ArrayList<>();
//        As as2 = new As();
//        as2.a = "1";
//        as2.s = 1;
//        list2.add(as1);
//
////        System.out.println(list1.removeAll(list2));
//
//        for (As as : list1) {
////            list1.remove(as);
//        }
//
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        Date bt = sdf.parse("2019-01-01");
//        Date et = new Date();
//        if (bt.before(et)){
//            System.out.println("小");
//        }else if (bt.equals(et)){
//            System.out.println("等");
//        }else{
//            System.out.println("大");
//        }
//        System.out.println(bt.toString());
    }

    static class As {
        public String a;
        public int s;
    }

    public enum Color {

//        RED("", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4)

    }


    public enum RoomType {
        LIVE(0),NEW(1),OPERATE(2);

        RoomType(int type){
            this.type  = type;
        }

        private Integer type;
    }

    public enum LevelMappingEnum {
        LEVEL_MAPPING_PLATFORM(1,"平台等级"),
        LEVEL_MAPPING_FANGRADE(2,"粉丝等级");



        LevelMappingEnum(int typeCode, String typeName) {
            this.typeCode = typeCode;
            this.typeName = typeName;
        }

        /**
         * @Fields typeCode : type的int值
         */
        private int typeCode;

        /**
         * @Fields typeName : type的名称
         */
        private String typeName;

    }

}
