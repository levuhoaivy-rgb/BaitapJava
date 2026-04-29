import java.util.Scanner;

public class bai3tongsochan {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int number1 = Integer.parseInt(number);
        int tong = 0;

        for (int i = 0; i <= number1; i++) {
            if (i % 2 == 0) {
                tong = tong + i;
            }
        }
        System.out.println("Tổng các số chẵn từ 0 đến " + number1 + " là: " + tong);
    }

}
