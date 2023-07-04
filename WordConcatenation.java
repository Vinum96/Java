package Homework4;

import java.util.Scanner;

public class WordConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.next();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.next();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            int halfLength1 = word1.length() / 2;
            int halfLength2 = word2.length() / 2;

            String concatenatedWord = word1.substring(0, halfLength1) + word2.substring(halfLength2);

            System.out.println("Результат: " + concatenatedWord);
        } else {
            System.out.println("Одно или оба слова имеют нечетное количество букв.");
        }
    }
}

