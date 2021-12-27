package ru.my.model;

import java.nio.charset.StandardCharsets;

public class Start {

public static void main (String[] args){

    boolean bu = true;
    int i=3;

    String s = new String("Hi");
    s = "Hi"+" Brat";

    System.out.println(!bu); //получаем противоположное значение не меняя переменную
    System.out.println(s);
    s = "Hi"+" Brat";
    System.out.println(s);
    System.out.println(s);

    int a=10,b=5;
    a-=b; // a=a-b
    a+=b; // a=a+b


    System.out.println(a);

    System.out.println(i++); //инкремент после
    System.out.println(++i); //инкремент до
    bu = a>b;
    System.out.println(bu);
    bu = a<b;
    System.out.println(bu);


}


}
