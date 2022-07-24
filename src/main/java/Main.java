public class Main {
    /* Данная программа проверяет является ли строка палиндромом.
    Палиндром - это слово, число, фраза или другая последовательность символов, которая читается одинаково как вперед, так и назад
    Палиндромы длиной в предложение игнорируют заглавные буквы, знаки препинания и границы слов.
     */
    public static void main(String args[]) {
        String myString = "А роза упала на лапу Азора";

        String myStringForward = myString.replaceAll("\\p{Punct}|\\p{Space}", "").toLowerCase();
        StringBuffer buffer = new StringBuffer(myStringForward);
        buffer.reverse();
        String myStringReverse = buffer.toString();
        if (myStringForward.equals(myStringReverse)) {
            System.out.println("Строка '" + myString + "' is palindrome ");
        } else {
            System.out.println("Строка '" + myString + "' is not palindrome ");
        }
    }
}
