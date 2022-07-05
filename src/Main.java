public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int addingAmount = 1100;
        int bonus;
        if (addingAmount > 1000) {
            bonus = addingAmount / 100;
        } else {
            bonus = 0;
        }

        int result = initialAmount + addingAmount + bonus;

        System.out.println("Ваш бонус " + bonus);
        System.out.println("Сумма на Вашем счете " + result);
    }
}