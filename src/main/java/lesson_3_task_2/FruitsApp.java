package lesson_3_task_2;

import java.util.ArrayList;

public class FruitsApp {
    public static void main(String[] args){


        Apple apple1 = new Apple(0.3);
        Apple apple2 = new Apple(0.25);
        Apple apple3 = new Apple(0.6);
        Apple apple4 = new Apple(0.5);
        Apple apple5 = new Apple(0.12);
        Apple apple6 = new Apple(0.23);

        ArrayList<Apple> applesList1 = new ArrayList<>();
        applesList1.add(apple1);
        applesList1.add(apple2);
        applesList1.add(apple3);
        applesList1.add(apple4);
        applesList1.add(apple5);
        applesList1.add(apple6);

        ArrayList<Apple> applesList2 = new ArrayList<>();
        applesList2.add(apple1);
        applesList2.add(apple6);
        applesList2.add(apple3);
        applesList2.add(apple5);
        applesList2.add(apple1);

        ArrayList<Apple> applesList3 = new ArrayList<>();
        applesList3.add(apple1);
        applesList3.add(apple6);
        applesList3.add(apple3);


        Orange orange1 = new Orange(1);
        Orange orange2 = new Orange(0.8);
        Orange orange3 = new Orange(1.3);
        Orange orange4 = new Orange(0.6);
        Orange orange5 = new Orange(0.27);
        Orange orange6 = new Orange(0.6);
        Orange orange7 = new Orange(1.4);

        ArrayList<Orange> orangesList1 = new ArrayList<>();
        orangesList1.add(orange1);
        orangesList1.add(orange2);
        orangesList1.add(orange3);
        orangesList1.add(orange4);

        ArrayList<Orange> orangesList2 = new ArrayList<>();
        orangesList2.add(orange1);
        orangesList2.add(orange2);
        orangesList2.add(orange3);
        orangesList2.add(orange4);
        orangesList2.add(orange4);
        orangesList2.add(orange5);
        orangesList2.add(orange7);
        orangesList2.add(orange6);


        ArrayList<Orange> orangesList3 = new ArrayList<>();
        orangesList3.add(orange2);
        orangesList3.add(orange3);
        orangesList3.add(orange4);
        orangesList3.add(orange4);
        orangesList3.add(orange5);

        //пустой
        ArrayList<Orange> orangesList0 = new ArrayList<>();


        Box<Apple> appleBox1 = new Box<>(applesList1);
        Box<Apple> appleBox2 = new Box<>(applesList2);
        Box<Apple> appleBox3 = new Box<>(applesList3);


        Box<Orange> orangeBox1 = new Box<>(orangesList1);
        Box<Orange> orangeBox2 = new Box<>(orangesList2);
        Box<Orange> orangeBox3 = new Box<>(orangesList3);
        Box<Orange> orangeBox0 = new Box<>(orangesList0);


        //        смотрим вес
        System.out.println("Первая коробка с яблоками.");
        appleBox1.showWeight();
        System.out.println(applesList1.size() + " шт.\n");

        System.out.println("Вторая коробка с яблоками.");
        appleBox2.showWeight();
        System.out.println(applesList2.size() + " шт.\n");

        System.out.println("Третья коробка с яблоками.");
        appleBox3.showWeight();
        System.out.println(applesList3.size() + " шт.\n");

//        пересыпаем и снова смотрим
        appleBox1.moveFruits(appleBox2);

        appleBox2.showWeight();
        System.out.println(applesList2.size() + " шт. \n" );


//        смотрим вес уже апельсинов
        System.out.println("Первая коробка с апельсинами");
        orangeBox1.showWeight();
        System.out.println(orangesList1.size() + " шт. \n");

        //      сравниваем
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("Сравниваем вес первой коробки с яблоками  и первой с апельсинами. ");
        appleBox1.comparePrint(orangeBox1);
        appleBox1.compareBool(orangeBox1);
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

        System.out.println("Вторая коробка с апельсинами");
        orangeBox2.showWeight();
        System.out.println(orangesList2.size() + " шт. \n");

        System.out.println("Третья коробка с апельсинами");
        orangeBox3.showWeight();
        System.out.println(orangesList3.size() + " шт. \n");
        System.out.println("Четвертая коробка с апельсинами");
        orangeBox0.showWeight();
        System.out.println(orangesList0.size() + " шт. \n");
//        пересыпаем и снова смотрим
        orangeBox1.moveFruits(orangeBox2);

        orangeBox2.showWeight();
        System.out.println(orangesList2.size() + " шт.");

    }
}
