package lesson_3_task_2;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public double getWeightBox() {
        double weightBox = 0;
        for (T fruit : getFruitList()) {
            if (fruit != null) {
                weightBox = weightBox + fruit.getWeightFruit();
            }
        }
        return weightBox;
    }


    public void showWeight(){
        if ( getWeightBox() == 0 ) {
            System.out.println("Коробка пуста ");
        } else {
            System.out.format("Вес коробки %.2f кг. %n", getWeightBox());
        }
    }


    //сравниваем коробки
    public void compareBool (Box<?> box) {
        this.getWeightBox();
        box.getWeightBox();
    }

    public void comparePrint (Box<?> box) {
        if ((this.getWeightBox() - box.getWeightBox()) != 0) {
            System.out.println("Вес Коробок разный");
        } else {
            System.out.println("Вес Коробок одинаковый ");
        }
    }


    public void moveFruits (Box<T> otherBox) {
        otherBox.getFruitList().addAll(getFruitList());
        this.getFruitList().clear();
        System.out.println("Пересыпаем из первой коробки во вторую коробку.");
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

}
