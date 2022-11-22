public class Main {
    public static void main(String[] args) {
        // Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Task 2
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Task 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
        //Task 4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Task 5
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && (!(i % 100 == 0) || (i % 400 == 0))) {//1900 и 2100 тут конечно нет, но за то с такой проверкой можно любые года подставлять
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println("\n");
        //Task 6
        for (int i = 1; i <= 14; i++) {
            byte result = (byte) (7 * i);
            System.out.print(result + " ");
        }
        System.out.println("\n");
        //Task 7
        short square = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(square + " ");
            square = (short) (square * 2);
        }
        System.out.println("\n");
        //Task 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("");
        //Task 9
        int salaryForTask9 = 29000;
        int  totalForTask9 = 0;
        for (int i = 1; i < 12; i++) {
            totalForTask9 = (int)((totalForTask9 + salaryForTask9)*1.12);//Копейки на благотворительность
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalForTask9 + " рублей");
        }

    }
}
