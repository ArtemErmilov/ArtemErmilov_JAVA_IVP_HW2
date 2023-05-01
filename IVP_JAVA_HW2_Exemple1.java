package Homework.IVP_JAVA_HW_Lessone002;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Задача 1
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class IVP_JAVA_HW2_Exemple1 {

    public static float inputFlout(String text) {
 
        float newFloat;
        
        while (true) {
            try {
                Scanner iScanner = new Scanner(System.in);
                System.out.print(text);
                newFloat = iScanner.nextFloat();
                iScanner.close();
                return newFloat;

            } catch (InputMismatchException e) {
                System.out.println("Данные введены не правильно, введите их заново.");
                continue;

            } 
        }

    }

    public static void main(String[] args) {

        float a = inputFlout("Введите данные в формате float:");
        System.out.println(a);

    }

}