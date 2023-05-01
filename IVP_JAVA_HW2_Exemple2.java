package Homework.IVP_JAVA_HW_Lessone002;

/*
Задача 2
 * Если необходимо, исправьте данный код (задание 2
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class IVP_JAVA_HW2_Exemple2 {

    public static void main(String[] args) {

        // Задание

        // try {
        //     int d = 0;
        //     double catchedRes1 = intArray[8] / d;
        //     System.out.println("catchedRes1 = " + catchedRes1);
        //  } catch (ArithmeticException e) {
        //     System.out.println("Catching exception: " + e);
        //  }

        // Изменения 

        double [] intArray = new double[] {1,2,3,4,5,6,7,8,9}; // Добавление массива
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Добавление в Exception ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
         }
         
        
    }
    
}
