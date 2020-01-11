public class Palindrome {
    public static void main(String[] args) { //for IDEA RUN -> Edit configuration -> Program arguments - java Palindrome madam racecar apple kayak song noon
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println( s +" - " + isPalindrome(s)); //выводим результат проверки на "палиндром"
        }
    }
    public static String reverseString(String s) {  //метод для переворачивания строки
        String rs="";                               //reversed string
        for (int i = s.length() - 1; i >= 0; i--)
            rs += s.charAt(i);
        return rs;                                  // переворачиваем и возвращаем строку
    }
    public static boolean isPalindrome(String s) {  //метод сравнения "прямой" и перевернутой строк
        String rs = reverseString(s);               //получаем перевернутую строку
        return s.equals(rs);                        // возвращаем результат сравнения
    }
}
