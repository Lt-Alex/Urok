package ru.my.model;

public class PrimitType {
    public static void main(String[] args) {

        boolean b = true;//Примитивный тип
        Boolean b1 = true;// Объект

        b=b1;

        System.out.println((boolean)b1);




        int i = 200;
        long k = i;

        i = (int) k;

        //System.out.println(k);
    }
}
