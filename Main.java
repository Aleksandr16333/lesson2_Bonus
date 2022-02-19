public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int replenishment = 1200;
        int bonus = 0;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;

            System.out.println("Пополнение на " + replenishment + " руб + " +  bonus + " Бонусных руб.");
        } else{
            System.out.println("Пополнение на " + replenishment + " руб.");
        }

        int newBalance = balance + replenishment + bonus;
        System.out.println("Ваш баланс " + newBalance + " рублей");


    }
}