package com.company;
import java.lang.reflect.Field;
public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException  {
        Apple apple = new Apple("red");
        Class appleClass = apple.getClass(); // инфа класса apple
        Field colorField = appleClass.getDeclaredField("color"); // тип field берет инфу private поля
        colorField.setAccessible(true); // т.к color не public , разрешаем дальнейшую работу

        String color = (String) colorField.get(apple); // берем инфу о поле
        color = "Blue"; // меняем его
        System.out.println("Цвет " + color); // выводим .... xDDDDDDDDDDDDDDDDDDD

    }
}
