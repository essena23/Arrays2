public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");
        int[] payment = {22_658, 15_985, 17_985, 20_200, 23_740};
        int sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum += payment[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //task 2
        System.out.println("task 2");
        int[] expenses = {10_300, 4_700, 8_958, 45_100, 25_780};
        int maxExpense = -1;
        int minExpense = 100_000;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
            if (expenses[i] < minExpense) {
                minExpense = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");
        //task 3
        System.out.println("task 3");
        int[] monthExpenses = {42_564, 65_215, 74_286, 78_654, 23_820};
        float total = 0;

        for (int i = 0; i < monthExpenses.length; i++) {
            total = total + monthExpenses[i] ;
        }
        System.out.println("Средняя сумма трат за месяц составила " + total / 4 + " рублей.");
        //task 4
        System.out.println("task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}