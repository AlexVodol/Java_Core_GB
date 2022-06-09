package lesson_4_task_1;

import java.util.*;

public class Task_1 {
    public static String[] arrayString = {"Frank", "Judy", "Emily", "Emily", "Mike", "Mike", "Larry",
            "Claudia", "Claudia", "Jackie", "Keith", "Harry", "Larry"};


    public static List<String> arrayList = new ArrayList<>(Arrays.asList(arrayString));


    public static void main(String[] args) {

        System.out.println();
        System.out.print(arrayList.toString() + "\n");
        System.out.println("List size=  " + arrayList.size());

        //Hashset - уникальный "массив"
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.print(hashSet + "\n");
        System.out.println("Set size=  " + hashSet.size());
        System.out.println();

       // Hashmap (K,V - K - уникальный) записать кол-во повторений
        HashMap<String,Integer> resultHashMap = new HashMap<>();
        //        пробегаемся по hashSet
        for(String car: hashSet){
            //   (пробегаемся по arrayList)
            resultHashMap.put(car, countV(car));
        }
        System.out.println(resultHashMap);

    }


    //  Метод чтобы поссчитать кол-во повторений и записать в HashMap
    public static Integer countV(String carFromHashSet){
        Integer result = 0;
        for (String i : arrayList) {
            if (i.equals(carFromHashSet)) result++;
        }
        return result;
    }

}
