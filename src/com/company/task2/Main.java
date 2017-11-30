package com.company.task2;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
	// write your code here
        String str = new String("Hello world! \n");

        str = str.intern();


        System.out.print("initial : " + str);
        Field arrField = null;

        for (Field field : str.getClass().getDeclaredFields()) {
            if(field.getName().equals("value")) {
                arrField = field;
            }
        }


        //System.out.println(arrField);



        arrField.setAccessible(true);
        arrField.set(str,new char[]{'H','e','l','l','o','!'});

        System.out.print("new String : ");
        System.out.println(str);
        System.out.println("Hello world! \n");
    }
}
