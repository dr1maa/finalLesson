package src;

public class Main {
    public static void main(String[] args) {
        String[] myArray = new String[]{"Hello", "Hi", "Bye", "Goodbye", "123", "2222"};
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            count++;
            String str = myArray[i];
            if (str.length() <= 3) {
                System.out.println(str);
            }
        }
        System.out.println("В массиве " + count + " строк");

    }
}
