package Homework.IVP_JAVA_HW_Lessone002;

import java.util.Scanner;

/*
 * Задание 4
 * 
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class  IVP_JAVA_HW2_Exemple4 {

    public static String inputData(String text) {

        
            Scanner iScanner = new Scanner(System.in);
            System.out.print(text);
            String data = iScanner.nextLine();
            iScanner.close();
            if (data.length()<1){
                System.out.println("Введена пустая строка!");
                throw new RuntimeException("Введена пустая строка!");
            }
            return data;       

        
    }

    public static void main(String[] args) {
        System.out.println(inputData("Введите данные: "));
    }

    
}
