import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
      SuperArray a1 = new SuperArray();
      /*
      System.out.println(a1.size());
      System.out.println(a1.get(9));
      System.out.println(a1.add("added new string"));
      System.out.println(a1.get(9));
      System.out.println(a1.set(9, "replaced string"));
      System.out.println(a1.get(9));
      a1.resize();
      System.out.println(a1.get(9));
      System.out.println(a1.get(18));
      */
      System.out.println(a1.get(9));
      for (int i = 0; i<12; i++) {
        a1.add("" + i);
        System.out.println(a1.get(i));
      }

      SuperArray words = new SuperArray();
      words.add("kani");
      words.add("uni");
      words.add("ebi");
      for(int i = 0; i < words.size(); i++){
        System.out.println( words.get(i) );
      }
    }
}
