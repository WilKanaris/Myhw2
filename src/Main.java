public class Main {
    public static void main(String[] args) {
        // Объявляем переменные
        int amount = 13_676; // Стоимость билета
        int bonusAmount = 20; // Количество рублей для одной бонусной миль

        // Рассчитываем количество бонусных миль
        int bonus = amount / bonusAmount;

        // Выводим результат
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
