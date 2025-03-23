public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        int[] expenses = {2000, 5000, 6000, 10000, 12000};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        System.out.println(" Сумма трат за месяц составила " + total + " рублей ");


        System.out.println(" Задача 2 ");
        int[] expenses1 = {2000, 5000, 6000, 10000, 12000};
        int min = expenses[0];
        int max = expenses[0];
        for (int expense : expenses) {
            min = expense;
            if (expense < min) {
                max = expense;
                System.out.println(" Минимальная сумма трат за неделю составила " + min + " рублей ");
                System.out.println(" Максимальная сумма трат за неделю составила " + max + " рублей ");
            }
        }

        System.out.println(" Задача 3 ");
        int[] expenses2 = {2000, 5000, 6000, 10000, 12000};
        int total1 = 0;
        for (int expense : expenses2) {
            total += expense;
        }
        double average = (double) total1 / expenses2.length;
        System.out.println(" Средняя сумма трат за месяц составила " + average + " рублей ");

        System.out.println(" Задача 4 ");
        char[] reserveFullName={'I', 'v', 'a', 'n', 'o', 'v', ' ', 'I', 'v', 'a', 'n'};
        for (int i=reserveFullName.length-1;i>=0;i--){
            System.out.println(reserveFullName);
        }


    }
}
