package lesson_4_task_2;

import java.util.HashMap;


public class PhoneBook {
    private final HashMap<Integer, String> phoneBookMap = new HashMap<>();


    public void add(Integer phone, String familyName) {
        phoneBookMap.put(phone, familyName);
    }

    // get phone number/s
    public String get (String familyName) {
        if (phoneBookMap.containsValue(familyName)) {
            StringBuilder phones = new StringBuilder(familyName + " phone: ");
            for(Integer key: phoneBookMap.keySet()) {
                if (phoneBookMap.get(key).equals(familyName))
                    phones.append(key).append("; ");
            }
            return phones.toString();
        } else return "Contact doesn't exist. 😐";
    }
}
