package lesson_3_task_1;

import java.util.Arrays;

public class Task1 {
    public static void switchIndex(String[] myArray, int index1, int index2)
            throws myArrayIndexOutOfBoundsException {
        int lengthArray = myArray.length-1;
        if (index1 > myArray.length || index2 > myArray.length) {
            throw new myArrayIndexOutOfBoundsException("Великоват твой индекс! Выбери диапазон от 0 до "
                    + lengthArray);
        }
        String temp1 = myArray[index1];
        String temp2 = myArray[index2];
        myArray[index1] = temp2;
        myArray[index2] = temp1;
    }



    public static void main(String[] args) {

        String[] cars = {"LADA", "TOYOTA", "BMW", "HYUNDUI", "Audi"};

        System.out.println(Arrays.toString(cars));
        try {
            Task1.switchIndex(cars, 0,3);
        } catch (myArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(cars));



    }

}
