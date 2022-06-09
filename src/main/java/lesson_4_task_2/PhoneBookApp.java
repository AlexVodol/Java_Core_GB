package lesson_4_task_2;



public class PhoneBookApp {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(805345234, "Sidorov");
        phoneBook.add(803355234, "Petrov");
        phoneBook.add(823423423, "Frolov");
        phoneBook.add(845646545, "Kravchenko");
        phoneBook.add(865967433, "Goodguy");
        phoneBook.add(811144332, "Sidorov");
        phoneBook.add(817730001, "Frolov");

        System.out.println();
        System.out.println(phoneBook.get("Sidorov"));
        System.out.println(phoneBook.get("Antonov"));

    }
}
