package main.java.org.hogwarts.collection;

/*
Второе задание
1. Создать класс User со следующими полями:
имя;
возраст;
место работы;
адрес.
2. В этом же классе создать статический метод groupUsers,
который принимает List из объектов User и возвращает Map,
где ключом является возраст пользователя, а значением —
список из всех пользователей в оригинальном списке,
которые имеют соответствующий возраст.

_________________________

Третье задание
1. В том же классе пользователя создать конструктор, который принимает в качестве параметров значения для всех полей класса.

2. В качестве статических констант в классе объявить 2 сета:
VALID_JOBS— сразу инициализировать его, содержащим 3 строки: “Google”, “Uber”, “Amazon”;
VALID_ADDRESSES— сразу инициализировать его, содержащим 3 строки: “London”, “New York”, “Amsterdam”.

3. В конструкторе провести валидацию этих параметров по следующим правилам:
имя не может быть пустым;
возраст не может быть меньше 18;
место работы должно содержаться во множестве VALID_JOBS;
адрес должен содержаться во множестве VALID_ADDRESSES.
Если хотя бы одно из условий не выполняется, то выбросить исключение IllegalArgumentException.
Иначе сохранить переданные значения в поля.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 25, "Company A", "Address 1"));
        users.add(new User("Bob", 30, "Company B", "Address 2"));
        users.add(new User("Charlie", 25, "Company C", "Address 3"));

        Map<Integer, List<User>> groupedUsers = User.groupUsers(users);
        System.out.println(groupedUsers);
    }

    String name;
    int age;
    String workPlace;
    String address;

    public User(String name, int age, String workPlace, String address) {

        Set<String> VALID_JOBS = new HashSet<>();
        VALID_JOBS.add("Google");
        VALID_JOBS.add("Uber");
        VALID_JOBS.add("Amazon");

        Set<String> VALID_ADDRESSES = new HashSet<>();
        VALID_ADDRESSES.add("London");
        VALID_ADDRESSES.add("New York");
        VALID_ADDRESSES.add("Amsterdam");

        System.out.println(VALID_JOBS);
        System.out.println(VALID_ADDRESSES);

        if (name.equals("")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        } else if (VALID_ADDRESSES.contains(workPlace)) {
            throw new IllegalArgumentException("nvalid workplace. Must be one of the valid jobs.");
        } else if (VALID_ADDRESSES.contains(address)) {
            throw new IllegalArgumentException("Invalid address. Must be one of the valid addresses.");
        } else {
            this.name = name;
            this.age = age;
            this.workPlace = workPlace;
            this.address = address;
        }
    }

    public static Map<Integer, List<User>> groupUsers(List<User> users) {
        Map<Integer, List<User>> mapFromList = new HashMap<>();
        // Iterate over each user in the list
        for (User user : users) {
            int userAge = user.age; // Get the age of the current user

            // Check if the age is already a key in the map
            if (!mapFromList.containsKey(userAge)) {
                mapFromList.put(userAge, new ArrayList<>()); // Initialize a new list for this age
            }

            // Add the current user to the list of their age
            mapFromList.get(userAge).add(user);
        }

        System.out.println("mapFromList: " + mapFromList);
        return mapFromList; // Return the map with grouped users by age
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", workPlace='" + workPlace + "', address='" + address + "'}";
    }
}