public class Primes {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {   //проверяем методом isPrime числа от 2 до 100
            if (isPrime(number) == true) System.out.println(number);  //выводим простое при нахождении
        }
    }
    public static boolean isPrime(int n) {      //Создаем метод проверки числа n на принадлежность к простым числам
        boolean prime = false;
        if (n == 2) prime = true;  // по условию задания (условия) к циклу
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                prime = false;
                break;
            }
            else prime = true;
        }
        return prime;
    }
}
