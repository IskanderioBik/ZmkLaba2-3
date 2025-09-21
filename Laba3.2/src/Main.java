import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(); // список животных

        // добавляем животных в список в заданном порядке
        animals.add("шиншилла");
        animals.add("крокодил");
        animals.add("лев");
        animals.add("медведь");
        animals.add("слон");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");

        for (String animal : animals) {
            System.out.println(animal.substring(0, 1).toUpperCase() + animal.substring(1));
        }
        // расписание кормлений по времени
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1)); // крокодил
        System.out.println("В 10:00 - " + animals.get(4)); // слон
        System.out.println("В 11:00 - " + animals.get(0)); // шиншилла
        System.out.println("В 12:00 - " + animals.get(2)); // лев
        System.out.println("В 13:00 - " + animals.get(3)); // медведь
    }
}