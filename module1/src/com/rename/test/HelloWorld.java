package com.rename.test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args){
        List<String> list = Arrays.asList("a", "b");
        list.stream().map(x -> x + x).forEach(System.out::println);
        list.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));

        Callable<Integer> a = () -> 2;
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
