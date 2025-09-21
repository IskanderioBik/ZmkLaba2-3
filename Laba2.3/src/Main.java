//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
        String beefKcal = "30.2"; // калорийность говядины
        String chickenKcal = "23.8"; // калорийность курицы
        String creamKcal = "32.1"; // калорийность сливок
        String milkKcal = "13.5"; // калорийность молока

        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Float.parseFloat(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesert, String secondDesert) {
        float minDishKcal = Float.min(Float.parseFloat(firstDishKcal), Float.parseFloat(secondDishKcal));
        float minDesertKcal = Float.min(Float.parseFloat(firstDesert), Float.parseFloat(secondDesert));
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(float catKcal) {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
}