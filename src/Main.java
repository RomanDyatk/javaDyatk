import java.util.*;

public class Main{
    static HashMap<String, Set<Integer>> phoneBook = new HashMap<>();
    public static void main(String[] args) {


        phoneBook.put("Николай", new HashSet<>());
        phoneBook.put("Олег", new HashSet<>());
        phoneBook.put("Виктор", new HashSet<>());
        phoneBook.put("Максим", new HashSet<>());
        phoneBook.put("Егор", new HashSet<>());

        addNumber("Николай", 123);
        addNumber("Олег", 321);
        addNumber("Олег", 213);
        addNumber("Виктор", 12345);
        addNumber("Виктор", 23145);
        addNumber("Виктор", 54321);
        addNumber("Максим", 678);
        addNumber("Егор", 893);


        List<Map.Entry<String, Set<Integer>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        sortedList.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        System.out.println(sortedList);
    }

    private static void addNumber(String key, int number){
        phoneBook.get(key).add(number);
    }


}