import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
      SuperArray a1 = new SuperArray();
      System.out.println(a1.size());
      System.out.println(a1.get(9));
      System.out.println(a1.add("added new string"));
      System.out.println(a1.get(9));
    }
}
