package ThirdWeek;

import java.util.Scanner;

//Написать метод, который проверяет является ли строка палиндромом
public class Third3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        boolean res1 = palindrom(text);
        System.out.println(res1);
    }

    public static boolean palindrom(String string) {
        for (int i = 0; i < string.length() / 2; ++i) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
