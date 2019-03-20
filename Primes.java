/**
* Программа выводит простые числа меньшие 100
*/
public class Primes {

    /**
    * Точка входа в программу
    */
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i + "  ");
            }
        }
    }
    
    
    /**
    * Функция, проверяющая является ли число простым
    */
    public static boolean isPrime(int target_number) {
        for (int i = 2; i <= target_number/2; i++) {
            if (target_number % i == 0) {
                return false;
            }
        }
        return true;
    }
} 
