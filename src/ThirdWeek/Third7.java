package ThirdWeek;

/**
 * Найти самое длинное слово в строке(разделенное одним пробелом)
 */
public class Third7 {
    public static void main(String[] args) {
        String text = "Это самая длинная строка";


        String[] arr = text.split(" ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr[i].trim();
        }
        int max = arr[0].length();
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
                ind = i;
            }

        }
        String result = arr[ind];
        System.out.println("Самое длинное слово: " + result);
    }
}
