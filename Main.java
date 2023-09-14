import java.util.Scanner;

public class Main {

  private static String temp = "";

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your text: ");
    String text = scan.next();
    System.out.println((isPalindrome(text)) ? "Palindrome" : "Not Palindrome");
  }

  private static void recursion(int length, String text) {
    if (length > 0) {
      temp += text.charAt(length - 1);
      recursion(length - 1, text);
    }
  }

  private static boolean isPalindrome(String text) {
    recursion(text.length(), text);
    return text.equalsIgnoreCase(temp);
  }

}