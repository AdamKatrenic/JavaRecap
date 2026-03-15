public class Kata {
  
  public static boolean validParentheses(String parenStr) {
    int count = 0;
    for (char c : parenStr.toCharArray()) {
      if (c == '(') {
        count++;
      } else if (c == ')') {
        count--;
        if (count < 0) {
          return false; 
        }
      }
    }
    return count == 0; 
  }
}