import java.util.Scanner;

public class laba {
    public static void main(String[] args) {
        //CONST
        Scanner input = new Scanner(System.in);
        final double price = 8.5;

        System.out.print("Введите начальные показания одометра: ");
        int start_km = input.nextInt();
        System.out.print("Введите конечные показания одометра: ");
        int final_km = input.nextInt();
        int km = final_km - start_km;
        double total_price = km * price;
        int rub = (int) total_price;
        int kop = (int) (total_price * 100) % 100;
        System.out.printf("Вы проехали %d км. Из расчета 8 руб. 50 коп. за км," +
                "стоимость проезда равна %d руб. %d коп.", km, rub, kop);

    }
}
